import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("b1", 56);
        Book b2 = new Book("b2", 15);
        Book b3 = new Book("b3", 82);
        Book b4 = new Book("b4", 25);

        List<Book> books = new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Collections.sort(books);

        Iterator<Book> iter = books.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
