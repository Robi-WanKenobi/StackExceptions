package StackExceptions;

/**
 * Created by Roberto on 22/02/2017.
 */
public class StackImplement<E> implements Stack<E>{

    private E stack[];
    int stackLeght;

    public StackImplement(){
        stack = (E[])new Object[5];
        this.stackLeght = 0;
    }

    public void push(E e) throws FullException {
        if (stackLeght >= 5) {
            throw new FullException("The stack is full");
        } else {
            stack[stackLeght] = e;
            this.stackLeght++;
        }
    }

    public E pop() throws EmptyException {
        E e;
        if (stackLeght <= 0){throw new EmptyException("The stack is empty");}
        else {
            e = stack[stackLeght - 1];
            this.stackLeght--;
            return e;
        }
    }
    public int size() {
        return stackLeght;
    }
}
