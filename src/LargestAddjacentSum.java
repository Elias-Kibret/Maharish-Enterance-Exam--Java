/*Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
If you are writing in Java or C#, the function signature is
int largestAdjacentSum(int[ ] a)
If you are writing in C or C++, the function signature is
int largestAdjacentSum(int a[ ], int len) where len is the number of elements in a  */
public class LargestAddjacentSum {
    public static void main(String[] args) {
        int[] arr = { 18, -12, 9, -10 };
        System.out.print(largestAdjacentSum(arr));
    }

    public static int largestAdjacentSum(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int largestAdjacentSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > largestAdjacentSum) {
                largestAdjacentSum = a[i] + a[i + 1];
            }
        }
        return largestAdjacentSum;
    }
}
