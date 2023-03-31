/*Write a function named sameNumberOfFactors that takes two integer arguments and
returns 1 if they have the same number of factors. If either argument is negative, return -
1. Otherwise return 0.

int sameNumberOfFactors(int n1, int n2)

if n1 is       and n2is                                        return
-6               21                             -1 (because one of the arguments is negative)
6                21                              1 (because 6 has four factors (1, 2, 3, 6) and so does 21 (1, 3, 7, 21)
8                12                              0 (because 8 has four factors(1, 2, 4, 8) 
                                                   and 12 has six factors (1, 2, 3, 4,6, 12)

23               97                              1 (because 23 has two factors (1, 23) and 
                                                    so does 97 (1, 97))

*/

public class SameNumberOfFactors {
    public static void main(String[] args) {
        System.out.print(sameNumberOfFactors(6, 12));
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }
        if (n1 == n2) {
            return 1;
        }
        if (numberOfFactors(n1) == numberOfFactors(n2)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int numberOfFactors(int n) {
        int count = 0;
        int factor = 1;
        while (factor <= n) {
            if (n % factor == 0) {
                count++;
            }
            factor++;
        }
        return count;
    }

}
