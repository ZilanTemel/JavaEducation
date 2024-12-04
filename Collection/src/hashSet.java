import java.util.*;

public class hashSet {
    public static void main(String[] args){
        HashSet<Object> h = new HashSet<>();
        h.add("12");
        h.add(12);
        h.add(12.0);
        h.add(true);
        h.add(null);

        Iterator<Object> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
