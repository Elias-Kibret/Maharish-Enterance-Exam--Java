/*1. Write a function named minDistance that returns the smallest distance between two factors of a 
number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013. 
minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 ­
11 = 2). As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8 
and the smallest distance between any two factors is 1 (2 – 1 = 1).
The function signature is
   int minDistance(int n)
 */

public class MinDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(1001));
    }

    public static int minDistance(int n) {
        if (n < 1) {
            return 0;
        }
        int diff = Integer.MAX_VALUE;
        int factor = 2;
        int prevFactor = 1;

        while (factor <= n) {
            if (n % factor == 0) {

                if ((factor - prevFactor) < diff) {
                    diff = factor - prevFactor;

                }
                prevFactor = factor;

            }
            factor++;
        }
        return diff;
    }
}