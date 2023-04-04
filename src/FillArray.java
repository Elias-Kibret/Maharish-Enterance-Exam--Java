/*Question 1. Write a function fill with signature
int[] fill(int[] arr, int k, int n)
which does the following: It returns an integer array arr2 of length n whose first k elements are the
same as the first k elements of arr, and whose remaining elements consist of repeating blocks of the
first k elements. You can assume array arr has at least k elements. The function should return null
if either k or n is not positive.
Examples: fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. Fill({4, 2, -3, 12}, 1, 5)
returns {4, 4, 4, 4, 4}. fill({2, 6, 9, 0, -3}, 0, 4) returns null.
 */
public class FillArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 12 };
        int[] result = fill(arr, 1, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }

    public static int[] fill(int[] arr, int k, int n) {
        if (n < 1) {
            return null;
        }
        int[] arr2 = new int[n];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (j == k) {
                j = 0;
            }
            arr2[i] = arr[j];
            j++;
        }
        return arr2;
    }
}
