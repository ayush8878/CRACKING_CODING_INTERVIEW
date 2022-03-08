package src.com.ayush.code.utils;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static Node generateLinkedList(int... args)
    {
        if(args == null || args.length == 0)
            return null;
        Node head = new Node(args[0]);
        Node prev = head;
        for(int i = 1; i< args.length;i++)
        {
            Node node = new Node(args[i]);
            prev.next = node;
            prev = node;
        }
        return head;
    }

    public static void print(Node n)
    {
        while (n !=null)
        {
            System.out.print(n.data);
            n = n.next;
            if(n != null)
            {
                System.out.print( " -> ");
            }
        }
        System.out.println("");
    }

    public static int length(Node n)
    {
        int len = 0;
        while (n !=null)
        {
            n = n.next;
            if(n != null)
            {
                len++;
            }
        }
        System.out.print("Lenght of list is :"+len);
        return len;
    }

    public static Node reverseAndClone(Node node)
    {
        Node reverseNode = null;
        while (node != null)
        {
            Node newNode = new Node(node.data);
            if(reverseNode == null)
            {
                reverseNode = newNode;
            }
            else
            {
                newNode.next = reverseNode;
                reverseNode = newNode;
            }
            node = node.getNext();
        }
        return reverseNode;
    }
}
