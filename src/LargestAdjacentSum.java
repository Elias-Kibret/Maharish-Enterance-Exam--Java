/*  Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
If you are writing in Java or C#, the function signature is
int largestAdjacentSum(int[ ] a)
If you are writing in C or C++, the function signature is
int largestAdjacentSum(int a[ ], int len) where len is the number of elements in a

Examples:
________________________________________________________________________________
|   if a is           |  return                                                 |
________________________________________________________________________________
|   {1, 2, 3, 4}      |  7 because 3+4 is larger than either 1+2 or 2+3         |
--------------------------------------------------------------------------------
|{18, -12, 9, -10}    | 6 because 18-12 is larger than -12+9 or 9-10            |
--------------------------------------------------------------------------------
|{1,1,1,1,1,1,1,1,1}  |  2 because all adjacent pairs sum to 2                  |
---------------------------------------------------------------------------------
|{1,1,1,1,1,2,1,1,1}  | 3 because 1+2 or 2+1 is the max sum of adjacent pairs   |
_________________________________________________________________________________
*/

public class LargestAdjacentSum {
    public static void main(String[] args) {
        int[] a = { 18, -12, 9, -10 };
        System.out.println(largestAdjacentSum(a));
    }

    public static int largestAdjacentSum(int[] a) {
        int largestSum = Integer.MIN_VALUE;
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] + a[j + 1] > largestSum) {
                largestSum = a[j] + a[j + 1];
            }
        }
        return largestSum;
    }
}