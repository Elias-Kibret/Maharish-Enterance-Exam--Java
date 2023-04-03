/*2. An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13
which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {0} is not a
Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime
numbers are positive.
Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array.
Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
 int isMagicArray (int[ ] a)
If you are writing in C or C++, the function signature is
 int isMagicArray (int a[ ], int len) where len is the number of elements in the array */

class Magic {
    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.print(isMagicArray(arr));
    }

    public static int isMagicArray(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                sum = sum + a[i];
            }
        }

        return sum == a[0] && a[0] > 1 ? 1 : 0;

    }

    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }
        int factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                return 0;
            }
            factor++;
        }
        return 1;
    }
}
