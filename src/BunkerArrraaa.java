/*2. A Bunker array is an array that contains the value 1 if and only if it contains a prime number. The array {7,
6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1. The array {7, 6, 10}
is not a Bunker array because it contains a prime number (7) but does not contain a 1. The array {6, 10, 1}
is not a Bunker array because it contains a 1 but does not contain a prime number.
 */
public class BunkerArrraaa {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 8, 1 };
        System.out.print(isBunker(arr));
    }

    public static int isBunker(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            boolean found1 = false;
            if (isPrime(a[i])) {

                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 1) {
                        found1 = true;
                    }
                }
            }
            if (found1) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
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
