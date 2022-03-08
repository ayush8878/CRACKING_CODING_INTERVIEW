package src.com.ayush.code.LinkedList;

import utils.Node;

public class SumLists {
    public static void main(String[] args) {
    Node list1 = Node.generateLinkedList(7,1,6);
    System.out.println("List1: ");
    Node.print(list1);
    Node list2 = Node.generateLinkedList(5,9,2);
    System.out.println("List2: ");
    Node.print(list2);
    int sum = sumLists(list1,list2);
    System.out.println("Sum is : "+sum);
    }

    private static int sumLists(Node list1, Node list2) {
        int carry = 0;
        StringBuilder sb  = new StringBuilder();
        while(list1 != null && list2 != null)
        {
                int dataSum = (list1.getData() + list2.getData())+carry;
                if(dataSum > 9)
                {
                    carry = dataSum/10;
                    dataSum = dataSum%10;
                }
                sb.append(dataSum);
            list1 = list1.getNext();
            list2 = list2.getNext();
        }
        while (list1 != null)
        {
            sb.append(carry+list1.getData());
            list1 = list1.getNext();
        }
        while (list2 != null)
        {
            sb.append(carry+list2.getData());
            list2 = list2.getNext();
        }
        return Integer.parseInt(sb.reverse().toString());
    }


}
