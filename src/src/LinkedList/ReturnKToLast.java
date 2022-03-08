package src.src.LinkedList;

import utils.Node;

public class ReturnKToLast {

    public static void main(String[] args) {
        Node root = Node.generateLinkedList(1,2,3,4,5);
        Node.print(root);
        Node kToLast = getKToLast(2,root);
        Node.print(kToLast);
    }

    /**
     * This method will get last k elements of LinkedList
     * @param k
     * @param node
     * @return
     */
    private static Node getKToLast(int k,Node node) {
        Node slow = node;
        while (node != null)
        {
            if(k<=0)
            {
                slow=slow.getNext();
            }
         k--;
         node = node.getNext();
        }
        return slow;
    }
}
