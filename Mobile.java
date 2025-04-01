import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mobile implements Comparable<Mobile> {
    String brand;
    double price;
    String color;

    public Mobile(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Price: " + price + ", Color: " + color;
    }

    @Override
    public int compareTo(Mobile m) {
        return this.brand.compareTo(m.brand);
    }

    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("Samsung s15", 25000.0, "Blue"));
        mobileList.add(new Mobile("Realme", 15000.0, "Black"));
        mobileList.add(new Mobile("Moto G10", 27000.0, "Red"));
        mobileList.add(new Mobile("Oneplus 13r", 40000.0, "OceanBlue"));

        Collections.sort(mobileList);

        System.out.println(mobileList);
    }
}
