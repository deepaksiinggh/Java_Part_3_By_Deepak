import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonDriver {

    public static void main(String[] args) {
        List<PersonHobbies> h1 = new ArrayList<>();
        List<PersonQualities> q1 = new LinkedList<>();
        List<Object> mergeList = new ArrayList<>();

        h1.add(new PersonHobbies("cricket", "Music", "Games", 45));
        h1.add(new PersonHobbies("cricket", "Music", "Games", 456));
        h1.add(new PersonHobbies("cricket", "Music", "Games", 99));
        q1.add(new PersonQualities("Sharp minder", "math", "English", 566));
        q1.add(new PersonQualities("Sharp minder", "math", "English", 05));
        q1.add(new PersonQualities("Sharp minder", "math", "English", 59));

        h1.sort(null);
        q1.sort(null);
        mergeList.addAll(h1);
        mergeList.addAll(q1);

        System.out.println(mergeList);

    }
}
