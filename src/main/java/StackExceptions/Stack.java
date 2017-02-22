package StackExceptions;

/**
 * Created by Roberto on 22/02/2017.
 */
public interface Stack<E> {

    void push(E e);
    E pop();
    int size();
}
