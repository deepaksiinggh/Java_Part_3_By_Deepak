

public class FrequencyInArr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 67, 7, 3, 9, 6, 7, 8, 3, 1, 2, 4, 5, 6, 6, 7, 7, 9, 0, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isCounted = true;
                    break;
                }

            }

            if (!isCounted) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(" the num is " + arr[i] + "And the frequency is " + count);
            }
        }

    }
}
