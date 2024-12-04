import java.util.*;

public class vector{ // Renamed the class to avoid conflicts with java.util.Vector
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(4, 2); // Initialize a Vector with initial capacity 4 and increment 2

        v.add("Pear");
        v.add("Cherry");
        v.add("Strawberry");
        v.add("Watermelon");
        v.add("Apple");
        v.add("Apple");

        System.out.println("Size: " + v.size()); // Corrected the size output
        System.out.println("Capacity: " + v.capacity()); // Corrected the capacity output

        v.remove(0); // Remove the first element ("Pear")
        System.out.println("First Element: " + v.firstElement()); // Print the first element after removal
    }
}
