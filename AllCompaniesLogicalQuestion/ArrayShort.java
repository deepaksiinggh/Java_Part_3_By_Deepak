public class ArrayShort {
    public static void main(String[] args) {
        int[] arr = { 2, 45, 1, 34, 56 };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = arr[j];
                }
            }
        }
        for (int gh : arr) {
            System.out.println(gh);
        }
    }
}
