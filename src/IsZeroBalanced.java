public class IsZeroBalanced {
    /*
     * An array is called zero-balanced if its elements sum to 0 and for each
     * positive
     * element n, there exists another element that is the negative of n. Write a
     * function named
     * isZeroBalanced that returns 1 if its argument is a zero-balanced array.
     * Otherwise it
     * returns 0.
     * 
     * 
     * If you are writing in Java or C#, the function signature is
     * int isZeroBalanced(int[ ] a)
     * If you are writing in C or C++, the function signature is
     * int isZeroBalanced(int a[ ], int len) where len is the number of elements in
     * a
     * 
     */

    public static void main(String[] args) {
        int[] arr = { 3, 4, -2, -3, -2 };
        System.out.println(isZeroBalanced(arr));
    }

    public static int isZeroBalanced(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    isFound = true;
                }
            }
            if (!isFound) {
                return 0;
            }
        }

        return 1;
    }
}
