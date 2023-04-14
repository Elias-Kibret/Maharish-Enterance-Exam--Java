/*. Write a function that takes two arguments, an array of integers and a positive, non-zero number n. It
sums n elements of the array starting at the beginning of the array. If n is greater than the number of
elements in the array, the function loops back to the beginning of the array and continues summing until it
has summed n elements. You may assume that the array contains at least one element and that n is greater
than 0.
If you are programming in Java or C#, the function signature is
int loopSum(int[ ] a, int n) */
public class LooopSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6 };
        System.out.print(loopSum(arr, 4));

    }

    public static int loopSum(int[] a, int n) {
        if (a.length == 0) {
            return 0;
        }
        int count = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == n) {
                break;
            }
            sum = sum + a[i];
            count++;
            if (i == a.length - 1) {
                i = -1;
            }
        }
        return sum;
    }
}
