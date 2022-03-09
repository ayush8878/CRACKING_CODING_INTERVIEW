package src.com.ayush.code.utils;

public class StackNodeWithMin<T> extends StackNode {

    T min;

    public StackNodeWithMin(T data, T min) {
        super(data);
        this.min = min;
    }
}
