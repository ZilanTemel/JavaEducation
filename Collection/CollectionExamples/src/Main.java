import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 8.8);
        Movie m2 = new Movie("The Godfather", 9.2);
        Movie m3 = new Movie("The Dark Knight", 9.0);
        Movie m4 = new Movie("Pulp Fiction", 8.9);

        List<Movie> movies = new LinkedList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);


        Collections.sort(movies);

        Iterator<Movie> iter = movies.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}