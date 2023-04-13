/*Write a function named minPrimeDistance that returns the smallest distance between
two prime factors of a number. For example, consider 13013. Its prime factors are 1, 7, 11, 13 and
13013. minPrimeDistance(13013) would return 2 because the smallest distance between any
two prime factors is 2 (13 - 11 = 2). As another example, minPrimeDistance (8) would return 1 */

public class MinPrimeDistance {
    public static void main(String[] args) {
        System.out.print(minPrimeDistance(8));
    }

    public static int minPrimeDistance(int n) {
        if (n < 1) {
            return 0;
        }
        int prevPrimeFactor = 1;
        int minPrimeDistance = Integer.MAX_VALUE;
        int factor = 2;
        while (factor <= n) {
            if (n % factor == 0) {
                if (factor - prevPrimeFactor < minPrimeDistance) {
                    minPrimeDistance = factor - prevPrimeFactor;
                    prevPrimeFactor = factor;
                }
            }
            factor++;
        }
        return minPrimeDistance;
    }
}
