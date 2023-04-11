/*A Bean array is defined to be an integer array where for every value n in the array, there is also an
element 2n, 2n+1 or n/2 in the array.
For example, {4, 9, 8} is a Bean array because
For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
The array {3, 8, 4} is not a Bean array because of the value 3 which requires that the array contains
either the value 6, 7 or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it
returns a 0.
If you are programming in Java or C#, the function signature is
 int isBean(int[ ] a)
If you are programming in C or C++, the function signature is
 int isBean(int a[ ], int len) where len is the number of elements in the array */

public class BeanArray {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 8 };
        System.out.print(isBean(arr));
    }

    public static int isBean(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        boolean nTimes2 = false, nTimes2Plus1 = false, nDivideBy2 = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (2 * a[i] == a[j]) {
                    nTimes2 = true;
                }
                if (2 * a[i] + 1 == a[j]) {
                    nTimes2Plus1 = true;
                }
                if (a[i] / 2 == a[j]) {
                    nDivideBy2 = true;
                }
            }
            if (nTimes2 && nTimes2Plus1 && nDivideBy2) {
                return 1;
            }
        }
        return 0;
    }
}
