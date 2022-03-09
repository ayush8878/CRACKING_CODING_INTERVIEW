package src.com.ayush.code.utils;

import java.util.EmptyStackException;

public class Stack<T> {

    private StackNode<T> top;

    public T pop()
    {
        if(top == null)
        {
            throw new EmptyStackException();
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    public void push(T t)
    {
        if(top == null)
        {
            top = new StackNode<T>(t);
        }
        top.setNext(new StackNode<>(t));
        top = top.getNext();
    }

    public T peek()
    {
        if(top == null)
        {
            throw new EmptyStackException();
        }
        T data = top.getData();
        return data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }
}
