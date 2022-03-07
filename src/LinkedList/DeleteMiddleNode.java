package LinkedList;

import utils.Node;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node root = Node.generateLinkedList(1,2,3,4,5);
        System.out.println("Before Delete");
        Node.print(root);
        Node middleNode = root.getNext().getNext();
        deleteMiddleNode(middleNode);
        System.out.println("After Delete");
        Node.print(root);
    }

    /**
     * This method will delete intermediate node from linked list
     * @param node
     */
    public static void deleteMiddleNode(Node node)
    {
        if(node == null || node.getNext() == null)
        {
            return;
        }
        Node prev = node;
        while(node.getNext()!=null)
        {
            node.setData(node.getNext().getData());
            prev = node;
            node = node.getNext();
        }
        prev.setNext(null);
    }
}
