package src.com.ayush.code.StacksAndQueues;

import src.com.ayush.code.utils.StackWithMin;

public class StackMin {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        //stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.min());
    }
}
