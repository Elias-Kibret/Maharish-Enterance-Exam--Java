/*Write a function named sameNumberOfFactors that takes two integer arguments and
returns 1 if they have the same number of factors. If either argument is negative, return -
1. Otherwise return 0.
int sameNumberOfFactors(int n1, int n2)
Examples: */
public class SameNumberOfFactorsss {
    public static void main(String[] args) {
        System.out.print(isSameNumberOfFactors(23, 97));
    }

    public static int isSameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }
        if (n1 == n2) {
            return 1;
        }
        if (numberFactors(n2) == numberFactors(n1)) {
            return 1;
        }
        return 0;
    }

    public static int numberFactors(int n) {
        int factor = 1, count = 0;
        while (factor <= n) {
            if (n % factor == 0) {
                count++;
            }
            factor++;
        }
        return count;
    }
}