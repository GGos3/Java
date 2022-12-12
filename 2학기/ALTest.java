import java.util.*;

public class ALTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(1024);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Stack<Double> st = new Stack<>();

        st.push(3.14);
        st.push(7.1);
        st.push(1.4);

        System.out.println(st.pop());
    }
}
