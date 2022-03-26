package src.com.ayush.code.StacksAndQueues;

import src.com.ayush.code.utils.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SetOfStacks {
    List<Stack<Integer>> listOfStacks = new ArrayList<>(1);
    int capacity = 3;
    int top = -1;
    int noOfStacks = 0;
    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();
        for(int i = 0 ; i<9;i++)
        {
            setOfStacks.push(i+1);
        }
        for(int i = 0 ; i<9;i++)
        {
            System.out.println("popped element is"+setOfStacks.pop());
        }

    }

    private void addNewStack()
    {
        listOfStacks.add(new Stack());
        noOfStacks++;
        top = 0;
    }

    public void removeLastStack()
    {
        if(noOfStacks < 0)
        {
            throw new EmptyStackException();
        }
        listOfStacks.remove(noOfStacks - 1);
        noOfStacks--;
    }

    public void push(int data)
    {
       Stack<Integer> stack = getStack();
       stack.push(data);
       top++;
    }

    private Stack<Integer> getStack() {
        if(top > capacity - 1 || top < 0)
        {
            addNewStack();
        }
        return listOfStacks.get(noOfStacks-1);
    }

    public int pop()
    {
        int data = listOfStacks.get(noOfStacks-1).pop();
        top--;
        if(top < 0)
        {
            removeLastStack();
            top = 0;
        }
        return data;
    }
}
