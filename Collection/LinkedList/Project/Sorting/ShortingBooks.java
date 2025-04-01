package Collection.LinkedList.Project.Sorting;

import java.util.ArrayList;
import java.util.List;

public class ShortingBooks implements Comparable<ShortingBooks> {
    String bookName;
    double price;

    public ShortingBooks(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    // Shorting based on BookName
    // public int compareTo(ShortingBooks b1) {

    // return b1.bookName.compareTo(this.bookName);
    // }

    // shorting based on price
    @Override
    public int compareTo(ShortingBooks b2) {
        if (b2.price == this.price) {
            return 0;
        } else if (this.price > b2.price) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "ShortingBooks [bookName=" + bookName + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        List<ShortingBooks> books = new ArrayList<>();

        books.add(new ShortingBooks("Rich dad poor dad", 450.90));
        books.add(new ShortingBooks("How to manipulate Anyone", 350));
        books.add(new ShortingBooks("The power of subconsious mind", 100.67));

        books.sort(null);
        System.out.println(books);
    }

}
