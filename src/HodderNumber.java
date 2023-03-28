public class HodderNumber {
    public static void main(String[] args) {
        System.out.println(isHodder(31));
    }

    public static int isHodder(int n) {
        if (n < 3) {
            return 0;
        }
        boolean isPrime = true;
        int primeFactor = 2;
        while (primeFactor < n) {

            if (n % primeFactor == 0) {
                isPrime = false;
                break;
            }
            primeFactor++;
        }
        System.out.println(isPrime);
        if (isPrime) {
            n = n + 1;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }

    }
}
