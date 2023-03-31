public class IsTwinPrime {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(7));
    }

    public static int isTwinPrime(int n) {
        if (n < 1) {
            return 0;
        }
        boolean isPrevPrime = isPrime(n - 2);
        boolean isNextPrime = isPrime(n + 2);
        boolean isNPrime = isPrime(n);

        if ((isPrevPrime || isNextPrime) && isNPrime) {
            return 1;
        }
        return 0;
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
