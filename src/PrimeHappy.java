public class PrimeHappy {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(8));

    }

    public static int isPrimeHappy(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {

            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        if (sum != 0 && sum % n == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
