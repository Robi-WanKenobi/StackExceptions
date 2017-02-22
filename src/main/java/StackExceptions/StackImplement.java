package StackExceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roberto on 22/02/2017.
 */
public class StackImplement<E> implements Stack<E>{

    private List<E> stack;

    public StackImplement(){
        stack = new ArrayList<E>();
    }

    public void push(E e) {
        stack.add(e);
    }

    public E pop() {
        E e;
        e = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return e;
    }

    public int size() {
        return stack.size();
    }
}
