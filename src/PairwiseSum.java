/*  Write a method named pairwiseSum that has an array with an even number of elements as a parameter
and returns an array that contains the pairwise sums of the elements of its parameter array.
If you are writing in Java or C#, the function signature is
int[ ] pairwiseSum(int[ ] a)
If you are writing in C or C++, the function signature is
int * pairwiseSum(int a[ ], int len) where len is the length of a 

The method returns null if
1. The array has no elements
2. The array has an odd number of elements
Otherwise, the method returns an array with arrayLength/2 elements. Each element of the returned array is
the sum of successive pairs of elements of the original array. See examples for more details.
Examples

Examples

if a is                                        return                       reason

{2, 1, 18, -5}                                   {3, 13}                  because 2+1=3, 18+-5=13. Note that 
                                                                          there are exactly 2
                                                                          elements in the returned array. You will lose full marks
                                                                          for this question if you return {3, 13, 0, 0}!

{2, 1, 18, -5, -5, -15, 0, 0, 1, -1}             {3, 13, -20, 0, 0}       because 2+1=3, 18+-5=13, -5+-15=-20, 0+0=0, 1+-1=0.
                                                                          Note that there are exactly 5 elements in the returned
                                                                          array. You will lose full marks for this question if you
                                                                          return {3, 13, -20, 0, 0, 0, 0, 0, 0, 0}!

{2, 1, 18}                                       null                      because there are an odd number of elements in the array.

{}                                               null                      because there are no elements in the array

*/

public class PairwiseSum {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 };
        int[] result = isPairWise(arr);
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }

    public static int[] isPairWise(int[] a) {
        if (a.length == 0 || a.length % 2 != 0) {
            return null;
        }
        int[] result = new int[a.length / 2];
        int count = 0;
        for (int j = 0; j < a.length - 1; j = j + 2) {
            result[count] = a[j] + a[j + 1];
            count++;
        }

        return result;
    }
}
