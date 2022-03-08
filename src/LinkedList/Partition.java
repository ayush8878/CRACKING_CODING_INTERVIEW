package LinkedList;

import utils.Node;

public class Partition {

    public static void main(String[] args) {
        Node root = Node.generateLinkedList(3,5,8,5,10,2,1);
        System.out.println("Before Partition");
        Node.print(root);
        partition(5,root);
        System.out.println("After Partition");
        Node.print(root);
    }

    /**
     * This method create a partition based on partition key
     * @param partitionKey
     * @param node
     */
    private static void partition(int partitionKey, Node node) {
        if(node == null || node.getNext() == null)
        {
            return;
        }
        Node nextMin = null;
        Node prev = node;
        while (node != null)
        {
            if(node.getData() < partitionKey)
            {
                if(nextMin == null)
                {
                    nextMin = node;
                }
                else {
                    Node temp = nextMin.getNext();
                    nextMin.setNext(node);
                    prev.setNext(node.getNext());
                    node.setNext(temp);
                    nextMin = nextMin.getNext();
                }
            }
            prev = node;
            node = node.getNext();
        }
    }
}
