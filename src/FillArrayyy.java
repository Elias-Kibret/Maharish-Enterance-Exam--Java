/*int[] fill(int[] arr, int k, int n)
which does the following: It returns an integer array arr2 of length n whose first k elements are the same as the first k
elements of arr, and whose remaining elements consist of repeating blocks of the first k elements. You can assume array
arr has at least k elements. The function should return null if either k or n is not positive.
Examples: fill({1,2,3,5, 9, 12,-2,-1}, */
public class FillArrayyy {
    public static void main(String[] args) {

    }

    public static int[] fill(int[] a, int k, int n) {
        if (a.length == 0 || k < 1 || n < 1) {
            return null;
        }
        int[] arr = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j == k) {
                j = 0;
            }
            arr[i] = a[j];
            j++;
        }
        return arr;
    }
}
