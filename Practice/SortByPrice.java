package Practice;
import java.util.Comparator;

public class SortByPrice implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2) {
        return m1.price.compareTo(m2.price);
    }
}
