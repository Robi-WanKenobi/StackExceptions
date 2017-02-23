package StackExceptions;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roberto on 22/02/2017.
 */
public class StackImplement<E> implements Stack<E>{

    private E stack[];
    int stackLength;

    public StackImplement(){
        stack = (E[])new Object[5];
        this.stackLength = 0;
    }

    public void push(E e) {
        stack[stackLength] = e;
        this.stackLength++;
    }

    public E pop() {
        E e;
        e = stack[stackLength - 1];
        this.stackLength--;
        return e;
    }
    public int size() {
        return stackLength;
    }
}
