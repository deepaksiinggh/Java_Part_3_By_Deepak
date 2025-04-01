

public class ReverseNum {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[] arr2 = new int[arr.length];
        arr[0] = 9;
        arr[1] = 234;
        arr[2] = 2;
        arr[3] = 235;
        arr[4] = 2347875;
        arr[5] = 23;
        int length = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr2[length] = arr[i];
            length++;

        }
        for (int val : arr2) {
            System.out.print(val + " ");
        }

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
