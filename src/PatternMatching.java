/*
 * Consider a simple pattern matching language that matches arrays of integers. A pattern is an array of
integers. An array matches a pattern if it contains sequences of the pattern elements in the same order as
they appear in the pattern. So for example, the array {1, 1, 1, 2, 2, 1, 1, 3} matches the pattern {1, 2, 1, 3}
as follows:
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (first 1 of pattern matches three 1s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 2s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 1s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (last element of pattern matches one 3 in array)
 
Examples
_________________________________________________________________________________________________________________________________________________________________________________________________________________
if a is                      and pattern  is   return                  reason
_________________________________________________________________________________________________________________________________________________________________________________________________________________
{1, 1, 1, 1, 1}                 {1}             1                  because all elements of the array match the pattern element 1
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1}                             {1}             1                  because all elements of the array match the pattern element 1
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 1, 2, 2, 2, 2}              {1, 2}          1                  because the first two 1s of the array are matched by the first patternelement, last four 2s of array are matched by the last pattern element
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 2, 3}                       {1, 2}          0                  because the 3 in the array is not in the pattern.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 2}                          {1, 2, 3}       0                  because the 3 in the pattern is not in the array
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 1, 2, 2, 2, 2, 3}           {1, 3}          0                  because at least one 3 must appear after the sequence of 1s.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 1, 1, 1}                    {1, 2}          0                  because the array ends without matching the pattern element 2.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 1, 1, 1, 2, 2, 3, 3}        {1, 2}          0                  because the element 3 of the array is not matched
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 1, 10, 4, 4, 3}             {1, 4, 3}       0                  because the 10 element is not matched by the 4 pattern element. Be sure your code handles this situation correctly!
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


*/

public class PatternMatching {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 10, 4, 4, 3 };
        int[] pattern = { 1, 10, 4, 3 };

        System.out.print(matched(arr, pattern));
    }

    public static int matched(int[] arr, int[] pattern) {
        if (arr.length < 1 || pattern.length < 1 || pattern.length > arr.length) {
            return 0;
        }
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == pattern[index]) {
                continue;
            } else if (index + 1 > pattern.length - 1) {
                return 0;
            } else if (arr[j] != pattern[index] && arr[j] == pattern[index + 1]) {
                index++;

            } else {
                return 0;
            }
        }

        return 1;
    }
}
