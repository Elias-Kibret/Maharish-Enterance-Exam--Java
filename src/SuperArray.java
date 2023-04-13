/* An Super array is defined to be an array in which each element is greater than sum of all
elements before that. See examples below:
{2, 3, 6, 13} is a Super array. Note that 2 < 3, 2+3 < 6, 2 + 3 + 6 < 13.
{2, 3, 5, 11} is a NOT a Super array. Note that 2 + 3 not less than 5.
Write a function named isSuper that returns 1 if its array argument is a isSuper array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is:
 int isSuper (int [ ] a)
If you are programming in C or C++, the function signature is:
112
 int isSuper (int a[ ], int len) where len is the number of elements in the array.*/
public class SuperArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 11 };
        System.out.println(isSuperArray(a));
    }

    public static int isSuperArray(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        for (int i = a.length - 1; i > 0; i--) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum = sum + a[j];
            }
            if (sum >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}
