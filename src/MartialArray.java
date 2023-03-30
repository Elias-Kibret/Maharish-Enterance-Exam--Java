/* Define an array to be a Martian array if the number of 1s is greater than the number of 2s and no two
adjacent elements are equal. Write a function named isMartian that returns 1 if its argument is a Martian
array; otherwise it returns 0.

If you are programming in Java or C#, the function signature is
int isMartian(int[ ] a)
If you are programming in C or C++, the function signature is
int isMartian(int a[ ], int len) where len is the number of elements in the array a.
There are two additional requirements.
1. You should return 0 as soon as it is known that the array is not a Martian array; continuing to analyze the
array would be a waste of CPU cycles.
2. There should be exactly one loop in your solution.

Examples
______________________________________________________________________________________________________________________________________________________
a is                                then function returns                                                              reason
------------------------------------------------------------------------------------------------------------------------------------------------------
{1, 3}                              1                                          There is one 1 and zero 2s, hence the number of 1s is 
                                                                                 greater than the number of 2s. Also, no adjacent elements
                                                                                 have the same value (1 does not equal 3)

{1, 2, 1, 2, 1, 2, 1, 2,1}          1                                         There are five 1s and four 2s, hence the number of 1s is
                                                                                greater than the number of 2s. Also, no two adjacent
                                                                                elements have the same value.

{1, 3, 2}                           0                                          There is one 1 and one 2, hence the number of 1s is not
                                                                                greater than the number of 2s.
{1, 3, 2, 2, 1, 5, 1, 5}            0                                          There are two 2s adjacent to each other.

{1, 2, -18, -18, 1, 2}              0                                         The two -18s are adjacent to one another. Note that the
                                                                               number of 1s is not greater than than the number of 2s but
                                                                               your method should return 0 before determining that! (See
                                                                               the additional requirements above.)

{}                                  0                                         There are zero 1s and zero 2s hence the number of 1s is not
                                                                               greater than the number of 2s.

{1}                                 1                                          There is one 1 and zero 2s hence the number of 1s is greater
                                                                               than the number of 2s. Also since there is only one element,
                                                                               there cannot be adjacent elements with the same value.
{2}                                 0                                          There are zero 1s and one 2 hence the number
__________________________________________________________________________________________________________________________________________________________
*/

public class MartialArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 1, 5, 1, 5 };
        System.out.print(martialArray(arr));
    }

    public static int martialArray(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int count1 = 0, count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {

                if (a[i] == a[i + 1]) {
                    return 0;
                }
            }
            if (a[i] == 1) {
                count1++;
            }
            if (a[i] == 2) {
                count2++;
            }
        }

        if (count1 <= count2) {
            return 0;
        } else {
            return 1;
        }
    }
}