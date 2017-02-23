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

        //Cola máxima de 5 objetos
        try {
            st.push(10);
            st.push(14);
            st.push(21);
            st.push(45);
            st.push(23);
            st.push(98);
        } catch (FullException e) {
            System.out.println(e.getMessage());
        }

        int a = 0;
        try {
            a = st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        } catch (EmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            st.push(23);
            st.push(14);
        } catch (FullException e) {
            System.out.println(e.getMessage());
        }
        int b = st.size();

        System.out.println("Pop: " +a+ " | Tamaño: "+b);
    }
}
