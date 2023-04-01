public class PrimeCount {
    public static void main(String[] args) {
        System.out.print(primeCount(-10, 6));
    }

    public static int primeCount(int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start < 0) {
            start = 2;
        }
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        int factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    }
}
