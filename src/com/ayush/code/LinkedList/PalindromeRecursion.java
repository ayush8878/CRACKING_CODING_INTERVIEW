package src.com.ayush.code.LinkedList;

import utils.Node;

public class PalindromeRecursion
{
    public static void main(String[] args) {
        Node root = Node.generateLinkedList(1, 2, 3, 4, 5, 6);
        System.out.println("Linked List: ");
        Node.print(root);
        boolean isPalindrome = isPalindrome(root);

    }

    private static boolean isPalindrome(Node root) {
        if(root == null)
        {
            return false;
        }
        int length = Node.length(root);
        isPalindrome(root,length,0);
        return false;
    }

    public static Node isPalindrome(Node node,int length,int index)
    {
        if(length % 2 == 0 &&  index == length/2)
        {

        }
      return null;
    }
}
