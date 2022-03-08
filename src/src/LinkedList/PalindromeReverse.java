package src.src.LinkedList;

import utils.Node;

public class PalindromeReverse {

    public static void main(String[] args) {
        Node root = Node.generateLinkedList(1, 2, 3, 2,1);
        Node.print(root);
        boolean isPalindrome = isPalindrome(root);
        System.out.println("Linked List: "+isPalindrome+" is palindrome: "+isPalindrome);

    }

    /**
     * This method finds reverse of linked list and check palindrome
     * @param node
     * @return
     */
    private static boolean isPalindrome(Node node) {
        Node reverse = Node.reverseAndClone(node);
        while(node != null)
        {
            if(node.getData() != reverse.getData())
            {
                return false;
            }
            node = node.getNext();
            reverse = reverse.getNext();
        }
        return true;
    }
}
