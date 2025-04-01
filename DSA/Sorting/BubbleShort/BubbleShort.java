package DSA.Sorting.BubbleShort;

import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                System.out.println(arr[i] + 1);
            }
        }
    }
}
