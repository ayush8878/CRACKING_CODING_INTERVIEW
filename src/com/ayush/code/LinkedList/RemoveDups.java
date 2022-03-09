package src.com.ayush.code.LinkedList;

import src.com.ayush.code.utils.Node;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDups {

    public static void main(String[] args) {
        removeDups(1);
        removeDups(1,1);
        removeDups(1,1,3,1,5,6,1);
        removeDups(1,1,3,4,5,6,1);
    }

    /**
     * This method will perform test and remove duplicates from linked list
     * @param input
     */
    private static void removeDups(int... input)
    {
        System.out.println("Performing test for "+ Arrays.toString(input));
        Node root = Node.generateLinkedList(input);
        System.out.println("Before removing dups");
        Node.print(root);
        System.out.println("After removing dups");
        removeDups(root);
        Node.print(root);
    }

    /**
     * This method will remove duplicate from linked list in O(n) using hashset
     * @param node
     */
    private static void removeDups(Node node) {
        HashSet<Integer> nodeSet = new HashSet<>();
        Node prev = node;
        while(node != null)
        {
            if(nodeSet.contains(node.getData()))
            {
                prev.setNext(node.getNext());
            }
            else
            {
                nodeSet.add(node.getData());
            }
            prev = node;
            node = node.getNext();
        }
    }
}
