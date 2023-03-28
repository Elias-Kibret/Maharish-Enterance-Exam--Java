/*3. Write a function named largestDifferenceOfEvens which returns the largest difference between even
valued elements of its array argument. For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9})
returns 6 = (4 - (-2)). If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens should
return -1.

If you are programming in Java or C#, the function signature is
int largestDifferenceOfEvens(int[ ] a)
If you are programming in C or C++, the function signature is
int largestDifferenceOfEvens(int a[ ], int len) where len is the number of elements in the array a.

Examples
_____________________________________________________________________________________________________
a is                       |  then function returns  |             reason
-----------------------------------------------------------------------------------------------------
{1, 3, 5, 9}               |     -1                  |  because there are no even numbers
{1, 18, 5, 7, 33}          |     -1                  |   because there is only one even number (18)
{[2, 2, 2, 2]}             |      0                  |   because 2-2 == 0
{1, 2, 1, 2, 1, 4, 1, 6, 4}|      4                  |   because 6 - 2 == 4
______________________________________________________________________________________________________



*/

public class LargestDifferenceOfEvens {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };
        System.out.print(largestDifferenceOfEvens(arr));
    }

    public static int largestDifferenceOfEvens(int[] a) {
        int maxEven = 0, minEven = 0, evenCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (evenCount == 0) {
                    minEven = maxEven = a[i];
                }
                evenCount++;
                if (a[i] > maxEven) {
                    maxEven = a[i];
                }
                if (a[i] < minEven) {
                    minEven = a[i];
                }
            }
        }

        if (evenCount > 1) {
            return maxEven - minEven;
        } else {
            return -1;
        }

    }
}
