

public class ElementRepetedEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 3, 4, 4, 4, 4 };

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                System.out.println(num);

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == num) {
                        arr[k] = -1;
                    }
                }
            }
        }
    }
}
