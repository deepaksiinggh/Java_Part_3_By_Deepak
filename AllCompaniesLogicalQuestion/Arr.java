public class Arr {
    public static void main(String[] args) {
        String str = "Deepak";
        String[] str2 = str.split("");
        for (int i = 0; i < str2.length; i++) {
            int count = 0;
            boolean isCounted = false;

            for (int j = 0; j < i; j++) {
                if (str2[i] == str2[j]) {
                    isCounted = true;
                    break;
                }

            }
            if (!isCounted) {
                for (int k = 0; k < str2.length; k++) {
                    if (str2[i] == str2[k]) {
                        count++;
                    }
                }
                System.out.println(" the num is " + str2[i] + "And the frequency is " + count);
            }
        }

    }
}
