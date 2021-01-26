package edu.kis.vh.nursery;

public interface IntStos {

    static final int RETVAL = 0;

    public void push(int in) ;

    public boolean isEmpty();

    public boolean isFull();

    public int top();

    public int pop();

}
