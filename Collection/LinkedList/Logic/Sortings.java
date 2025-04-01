package Collection.LinkedList.Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sortings implements Comparable<Sortings> {
    String bookName;
    double price;

    public Sortings(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public int compareTo(Sortings obj) {
        return this.bookName.compareTo(obj.bookName); // Sorting by book name (lexicographical order)
    }

    @Override
    public String toString() {
        return "Sortings [bookName=" + bookName + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        List<Sortings> books = new ArrayList<>();
        books.add(new Sortings("Python", 567.3));
        books.add(new Sortings("Java", 5.3));
        books.add(new Sortings("js", 56.3));

        Collections.sort(books); // Sort using Comparable implementation
        System.out.println("Sorted by bookName: " + books);
    }
}
