/*1. A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
other than 1 and itself.
You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime
number. You do not need to write isPrime. You are allowed to use this function.
The function signature
 int isPrimeProduct(int n)
 */
public class PrimeProduct {
    public static void main(String[] args) {
        System.out.print(primeProduct(22));
    }

    public static int primeProduct(int n) {
        if (n < 2) {
            return 0;
        }
        int product = 1;
        int factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                product = product * factor;
            }
            factor++;
        }

        if (product == n) {
            return 1;
        }
        return 0;

    }
}
