/*A hodder number is one that is prime and is equal to 2j

-1 for some j. For example, 31

is a hodder number because 31 is prime and is equal to 25

-1 (in this case j = 5). The first 4

hodder numbers are 3, 7, 31, 127

Write a function with signature int isHodder(int n) that returns 1 if n is a hodder
number, otherwise it returns 0.
Recall that a prime number is a whole number greater than 1 that has only two whole
number factors, itself and 1.

*/

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
