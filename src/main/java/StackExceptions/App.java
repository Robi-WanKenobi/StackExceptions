package StackExceptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Stack<Integer> st = new StackImplement<Integer>();

        st.push(10);
        st.push(14);
        st.push(21);
        int a = st.pop();
        int b = st.size();

        System.out.println("Pop: " +a+ " | Tamaño: "+b);
    }
}
