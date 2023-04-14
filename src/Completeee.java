/*An array is called complete if it contains an even element, a perfect square and two different elements
that sum to 8. For example, {3, 2, 9, 5} is complete because 2 is even, 9 is a perfect square and a[0] + a[3]
= 8.
 Write a function named isComplete that accepts an integer array and returns 1 if it is a complete array,
otherwise it returns 0. Your method must be efficient. It must return as soon as it is known that the
array is complete. Hint: reuse the method you wrote for question 1 */
public class Completeee {
    public static void main(String[] args) {
        int[] arr = { 36, 28 };
        System.out.println(isComplete(arr));
    }

    public static int isComplete(int[] a) {
        boolean isSum8 = false, isPrefectSquare = false, isEven = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                isEven = true;
            }
            if (isPrefectSquare(a[i])) {
                isPrefectSquare = true;
            }
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    isSum8 = true;
                }
            }
            if (isSum8 && isPrefectSquare && isEven) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isPrefectSquare(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        int factor = 1;
        while (factor <= n) {
            if (factor * factor == n) {
                return true;
            }
            factor++;
        }
        return false;
    }
}
