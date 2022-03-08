package LinkedList;

import utils.Node;

public class SumListsRecursion {

    public static void main(String[] args) {
        Node list1 = Node.generateLinkedList(7,1,6);
        System.out.println("List1: ");
        Node.print(list1);
        Node list2 = Node.generateLinkedList(5,9,2);
        System.out.println("List2: ");
        Node.print(list2);
        int sum =  sumLists(list1,list2);
        System.out.println("Sum is : "+sum);
    }

    private static int sumLists(Node list1, Node list2) {
        Node result = sumLists(list1,list2,0);
        int sum = 0;
        int factor = 1;
        while(result != null)
        {
            sum += result.getData()*factor;
            factor*=10;
            result = result.getNext();
        }
        return sum;
    }

    /**
     * This method will calculate sum list using recursion
     * @param list1
     * @param list2
     * @param carry
     * @return
     */
    private static Node sumLists(Node list1, Node list2,int carry) {
        // stop only when list1 , list2 and carry are 0
        if(list1 == null && list2 == null && carry ==0)
        {
            return null;
        }
        Node result = new Node(0);
        // add list1 , list2 and carry data
        int value = carry;
        if(list1 != null)
        {
            value+=list1.getData();
        }
        if(list2 != null)
        {
            value+=list2.getData();
        }
        // store Once digit of Value
        result.setData(value % 10);
        // if any of list1 and list2 are not null then recursively call the logic
        if(list1 != null || list2 != null)
        {
            Node more = sumLists(list1 == null ? null : list1.getNext(),list2 == null ? null : list2.getNext(),value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
