public class PersonHobbies implements Comparable<PersonHobbies> {
    String Hobbies1;
    String Hobbies2;
    String Hobbies3;
    int MaxNohobbies;

    @Override
    public int compareTo(PersonHobbies obj) {
        if (this.MaxNohobbies > obj.MaxNohobbies) {
            return 1;
        } else if (this.MaxNohobbies < obj.MaxNohobbies) {
            return -1;
        } else {
            return 0;
        }

    }

    public PersonHobbies(String hobbies1, String hobbies2, String hobbies3, int maxNohobbies) {
        Hobbies1 = hobbies1;
        Hobbies2 = hobbies2;
        Hobbies3 = hobbies3;
        MaxNohobbies = maxNohobbies;
    }

    @Override
    public String toString() {
        return "PersonHobbies [Hobbies1=" + Hobbies1 + ", Hobbies2=" + Hobbies2 + ", Hobbies3=" + Hobbies3
                + ", MaxNohobbies=" + MaxNohobbies + "]";
    }

}
