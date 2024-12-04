import java.util.*;

public class treeSet {
    public static void main(String[] args){
        TreeSet tree = new TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(6);
        tree.add(4);

        tree.forEach(item -> System.out.println(item));

    }
}
