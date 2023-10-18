import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", 1925));
        books.add(new Book("Moby Dick", 1851));
        books.add(new Book("1984", 1949));
        books.add(new Book("The Great Gatsby", 2000)); // A hypothetical newer edition

        System.out.println("Before sorting:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Sort using the defined comparator
        books.sort(new BookComparator());

        System.out.println("\nAfter sorting:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

