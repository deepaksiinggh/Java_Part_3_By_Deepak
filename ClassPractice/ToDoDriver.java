import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Collection.Sorting.Project.Amazon.AmazonProduct;

public class ToDoDriver {
    public static void main(String[] args) {
        List<To_DoTask> tasks = new ArrayList<>();
        tasks.add(new To_DoTask("Bathing", 3.4, "Bathing with soap", 1));
        tasks.add(new To_DoTask("Eating", 0.3, "Eat egg", 2));
        tasks.add(new To_DoTask("Driving", 1.2, "Highway", 3));
        tasks.add(new To_DoTask("Watching movies", 2.5, "Dexter movie", 4));

        Comparator<To_DoTask> shortByDuration = new Comparator<To_DoTask>() {
            @Override
            public int compare(To_DoTask t1, To_DoTask t2) {
                return t1.duration.compareTo(t2.duration);
            }

        };

        tasks.sort(shortByDuration);

        Iterator<To_DoTask> irr = tasks.iterator();
        ListIterator<To_DoTask> iir2 = tasks.listIterator(tasks.size());

        while (irr.hasNext()) {
            System.out.println(irr.next());
        }

        while (iir2.hasPrevious()) {
            System.out.println(iir2.previous());
        }
    }
}
