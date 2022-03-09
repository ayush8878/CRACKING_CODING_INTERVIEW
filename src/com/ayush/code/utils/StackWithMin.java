package src.com.ayush.code.utils;

public class StackWithMin extends Stack<StackNodeWithMin>{

    public void push(int data) {
        int newMin = Math.min(data,min());
        super.push(new StackNodeWithMin(data,newMin));
    }

    public int min() {
        if(this.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return (int) peek().min;
        }
    }
}
