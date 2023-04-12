/*A Bean array is defined to be an integer array where for every value n in the array, there is also an element
2n, 2n+1 or n/2 in the array.

For example, {4, 9, 8} is a Bean array because
For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
*/
public class BeaanArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 5, 11, 23 };
        System.out.print(isBeanArray(arr));
    }

    public static int isBeanArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        boolean nX2 = false, nX2PlusOne = false, nDivide2 = false;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] == 2 * arr[i]) {
                    nX2 = true;
                }
                if (arr[j] == 2 * arr[i] + 1) {
                    nX2PlusOne = true;
                }
                if (arr[j] == arr[i] / 2) {
                    nDivide2 = true;
                }
            }

        }
        if (nX2 || nX2PlusOne || nDivide2) {
            return 1;
        }
        return 0;
    }
}
