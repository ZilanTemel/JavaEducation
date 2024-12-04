import java.util.*;
public class queue {
    public static void main(String[] args){
            Queue q = new LinkedList();
            q.add("Deniz");
            q.add("Mehmet");
            q.offer("Ali");
            q.offer("Damla");

        System.out.println("element():+peek()");
        q.forEach(i-> System.out.println(i));
    }
}
