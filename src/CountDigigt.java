public class CountDigigt {
    public static void main(String[] args) {
        System.out.println(countDigit(333331, 0));
    }

    public static int countDigit(int n, int m) {
        if (n < 0) {
            return 0;
        }
        int countDigit = 0;
        while (n != 0) {
            if (n % 10 == m) {
                countDigit++;
            }
            n = n / 10;
        }
        return countDigit;
    }
}
