package src.com.ayush.code.StacksAndQueues;

import java.util.Arrays;
import java.util.EmptyStackException;

public class FixedMultiStack {

    // this will store values
    int values[];
    // size of each stack
    int size[];
    // capacity
    int capacity;
    // total no of stack
    int noOfStack = 3;

    public void printStackTrace()
    {
        System.out.println("Values : "+ Arrays.toString(values));
        System.out.println("Size : "+Arrays.toString(size));
        System.out.println("Capacity : "+capacity);
        System.out.println("No of Stack : "+noOfStack);
        System.out.println("-------------------");
    }

    public FixedMultiStack(int capacity) {
        this.capacity = capacity;
        values = new int[noOfStack * capacity];
        size = new int[noOfStack];
    }

    /**
     * This method will push data in multi stack
     * @param data
     * @param stack
     */
    public void push(int data,int stack)
    {
        // first check if stack is full and throw exception
        if(isFull(stack))
        {
            throw new EmptyStackException();
        }
        /* It is important to increase the size first and then look for next index */
        // increase size of stack to make sure there is no overflow
        size[stack]++;
        // find topIndex
        int topIndex = getTopIndex(stack);
        values[topIndex] = data;
    }

    /**
     * This method will pop elements from stack
     * @param stack
     * @return
     */
    public int pop(int stack)
    {
        // Check if stack is empty
        if(isEmpty(stack))
        {
            throw new EmptyStackException();
        }
        // find top of stack
        int topIndex = getTopIndex(stack);
        // pop the top of stack
        int value = values[topIndex];
        // clear
        values[topIndex] = 0;
        // reduce size
        size[stack]--;
        return value;
    }

    /**
     * This method will peek on stack
     * @param stack
     * @return
     */
    public int peek(int stack)
    {
        // Check if stack is empty
        if(isEmpty(stack))
        {
            throw new EmptyStackException();
        }
        int topIndex = getTopIndex(stack);
        int value = values[topIndex];
        return value;
    }


    /**
     * This method will check if stack is empty
     * @param stack
     * @return
     */
    private boolean isEmpty(int stack) {
        if(size[stack] == 0)
        {
            return true;
        }
        return false;
    }


    /**
     * This method will provide top index of stack by using offset and size
     * @param stack
     * @return
     */
    private int getTopIndex(int stack) {
        int offset = stack*capacity;
        int size = this.size[stack] -1 ;
        return offset+size;
    }

    private boolean isFull(int stack) {
        if(this.size[stack] == this.capacity)
        return true;
        else
        return false;
    }


    public static void main(String[] args) {
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.printStackTrace();
        /* PUSH */
        fixedMultiStack.push(1,0);
        fixedMultiStack.push(4,1);
        fixedMultiStack.push(7,2);
        fixedMultiStack.printStackTrace();
        /* PUSH */
        fixedMultiStack.push(2,0);
        fixedMultiStack.push(5,1);
        fixedMultiStack.push(8,2);
        fixedMultiStack.printStackTrace();
        /* PUSH */
        fixedMultiStack.push(3,0);
        fixedMultiStack.push(6,1);
        fixedMultiStack.push(9,2);
        fixedMultiStack.printStackTrace();
        /* Overflow */
        //fixedMultiStack.push(4,0);
        /* POP */
        fixedMultiStack.pop(0);
        fixedMultiStack.pop(0);
        fixedMultiStack.pop(0);
        fixedMultiStack.printStackTrace();
        /* empty stack exception */
        //fixedMultiStack.pop(0);
        /* POP */
        fixedMultiStack.pop(1);
        fixedMultiStack.pop(1);
        fixedMultiStack.pop(1);
        fixedMultiStack.printStackTrace();
        /* POP */
        fixedMultiStack.pop(2);
        fixedMultiStack.pop(2);
        fixedMultiStack.pop(2);
        fixedMultiStack.printStackTrace();

    }
}
