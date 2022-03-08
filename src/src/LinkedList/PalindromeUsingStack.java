package src.src.LinkedList;

import utils.Node;

import java.util.LinkedList;

public class PalindromeUsingStack {

    public static void main(String[] args) {
        Node root = Node.generateLinkedList(1,2,2,1);
        Node.print(root);
        boolean isPalindrome = isPalindrome(root);
        System.out.print(" is palindrome: "+isPalindrome);

    }

    private static boolean isPalindrome(Node node) {
        Node fast = node;
        Node slow = node;
        LinkedList<Integer> stack = new LinkedList<>();
        while(fast != null && fast.getNext()!= null)
        {
            stack.push(slow.getData());
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        /*Skip middle element if present*/
        if(fast != null)
        {
            slow = slow.getNext();
        }
        while (slow != null)
        {
            Integer top = stack.pop();
            if(top != slow.getData())
            {
                return false;
            }
            slow = slow.getNext();
        }
        return true;
    }
}
