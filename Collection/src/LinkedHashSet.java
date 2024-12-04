import java.util.*;
public class LinkedHashSet {
    public static void main(String [] args){
        HashSet<String> days=new HashSet<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        Iterator<String> itr = days.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
