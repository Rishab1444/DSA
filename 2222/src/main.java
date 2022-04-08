import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        Deque<Integer> a =new ArrayDeque<>();
        a.add(197);
        a.add(123);
        a.add(169);
        Iterator v = a.descendingIterator();
        while (v.hasNext())
        {
            System.out.println(v.next());
        }
    }
}
