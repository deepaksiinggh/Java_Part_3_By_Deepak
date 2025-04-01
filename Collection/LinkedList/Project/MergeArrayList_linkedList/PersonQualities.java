public class PersonQualities implements Comparable<PersonQualities> {
    String quality1;
    String quality2;
    String quality3;
    int noOfQualities;

    @Override
    public int compareTo(PersonQualities obj) {
        if (this.noOfQualities > obj.noOfQualities) {
            return 1;
        } else if (this.noOfQualities < obj.noOfQualities) {
            return -1;
        } else {
            return 0;
        }

    }

    public PersonQualities(String quality1, String quality2, String quality3, int noOfQualities) {
        this.quality1 = quality1;
        this.quality2 = quality2;
        this.quality3 = quality3;
        this.noOfQualities = noOfQualities;
    }

    @Override
    public String toString() {
        return "PersonQualities [quality1=" + quality1 + ", quality2=" + quality2 + ", quality3=" + quality3
                + ", noOfQualities=" + noOfQualities + "]";
    }

}
