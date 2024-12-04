import java.util.*;
public class MyArrayList {

    public static void main(String [] args){
        ArrayList city= new ArrayList();
        city.add("Ankara");
        city.add("Van");
        city.add("Karabük");
        city.add("Van");

        city.add(1,"İstanbul");
        city.remove(1);

        Iterator itr= city.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }



}
