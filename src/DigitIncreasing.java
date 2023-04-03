public class DigitIncreasing {
    public static void main(String[] args) {
        System.out.print(isDigitIncreasing(7));
    }

    public static int isDigitIncreasing(int n) {
        int copyN = n;
        int countDigit = 0;
        while (copyN != 0) {
            copyN = copyN / 10;
            countDigit++;
        }
        for (int i = 1; i < 10; i++) {
            String numb = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < countDigit - 2; j++) {

                numb = numb + numb;

            }
            sum = sum + Integer.parseInt(numb);

            if (n == sum) {
                return 1;
            }
        }
        return 0;
    }
}
