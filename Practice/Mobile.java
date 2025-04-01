package Practice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mobile {
    String name;
    Double price;

    @Override
    public String toString() {
        return "Shorting [name=" + name + ", price=" + price + "]";
    }

    public Mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Mobile> s1 = new ArrayList<>();
        s1.add(new Mobile("Moto", 450));
        s1.add(new Mobile("realme", 45));
        s1.add(new Mobile("Nokia", 4500));

        Comparator<Mobile> c1 = new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                return o1.price.compareTo(o2.price);
            }
        };
        s1.sort(c1);
        System.out.println(s1);
    }

}
