
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 67, 7, 2 };

        int len = arr.length;
        int secondarrIn = 0;
        int[] notRepeatedElem = new int[len];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1) {
                notRepeatedElem[secondarrIn] = arr[i];
                secondarrIn++;
            }
        }
        for (int i = 0; i < secondarrIn; i++) {
            System.out.println(notRepeatedElem[i]);
        }

    }
}
