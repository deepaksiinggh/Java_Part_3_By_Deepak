

public class HighestreapitingElem {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 2, 3 };
        int maxFrequent = 1;
        int Elem = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isretated = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isretated = true;
                }
            }

            if (isretated) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }

                }
            }

            if (count < maxFrequent) {
                maxFrequent = count;
                Elem = arr[i];
            }

        }

        System.out.println(Elem + " " + maxFrequent);
    }
}
