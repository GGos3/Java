import java.util.ArrayList;
import java.util.List;

public class IndexOutBoundsException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);

        System.out.println(list.get(0));
    }
}
