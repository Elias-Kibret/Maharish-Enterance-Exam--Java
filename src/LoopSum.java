/* Write a function that takes two arguments, an array of integers and a positive, non-zero number n. It
sums n elements of the array starting at the beginning of the array. If n is greater than the number of
elements in the array, the function loops back to the beginning of the array and continues summing until it
has summed n elements. You may assume that the array contains at least one element and that n is greater
than 0.

If you are programming in Java or C#, the function signature is
int loopSum(int[ ] a, int n)

The signature of the function is
int isSquare(int n)
Examples:
____________________________________________________________________________
if n is                return       reason
   4                     1           because 4 = 2*2
   25                    1           because 25 = 5*5
   -4                    0           because there is no 
                                     integer that when squared equals -4.
                                     (note, -2 squared is 4 not -4)
   8                     0           because the square root 
                                     of 8 is not an integer.
   0                     1           because 0 = 0*0
________________________________________________________________________________



*/
public class LoopSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        System.out.print(loopSum(arr, 2));
    }

    public static int loopSum(int[] a, int n) {
        if (a.length == 0 || n < 1) {
            return 0;
        }
        int sum = 0;
        int loop = n % 2 == 0 && n > a.length ? n / a.length : n / a.length + 1;
        for (int i = 0; i < loop; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < n) {
                    sum = sum + a[j];

                }
            }
            n = n - a.length;
        }
        return sum;
    }
}
