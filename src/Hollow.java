/*An array is said to be hollow if it contains 3 or more zeros in the middle that are
preceded and followed by the same number of non-zero elements. Furthermore, all the
zeroes in the array must be in the middle of the array. Write a function named isHollow
that accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isHollow(int[ ] a)
If you are programming in C or C++, the function signature is
int isHollow(int a[ ], int len) where len is the number of elements in the array

Examples:
if the input array is         is hollow?                reason

{1,2,0,0,0,3,4}                yes                     2 non-zeros precede and follow 3 zeros in the middle

{1,1,1,1,0,0,0,0,0,2,1,2,18}   yes                     4 non-zeros precede and follow the 5 zeros in the middle

{1, 2, 0, 0, 3, 4}             no                      There are only 2 zeroes in the middle; at least 3 are required

{1,2,0,0,0,3,4,5}              no                      The number of preceding non-zeros(2) is not equal to the number of following non-zeros(3)
{3,8,3,0,0,0,3,3}              no                      The number of preceding non-zeros(3) is not equal to the number of following non-zeros(2)
{1,2,0,0,0,3,4,0}              no                      Not all zeros are in the middle
{0,1,2,0,0,0,3,4}              no                      Not all zeros are in the middle
{0,0,0}                        yes                     The number of preceding non-zeros is 0 which 
                                                       equals the number of following non-zeros. And
                                                       there are three zeros "in the middle".


Hint: Write three loops. The first counts the number of preceding non-zeros. The second

counts the number of zeros in the middle. The third counts the number of following non-
zeros. Then analyze the results.
*/

public class Hollow {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 };
        System.out.print(hollow(arr));
    }

    public static int hollow(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }

        int zeroCount = 0;
        int countLeftNonZero = 0;
        int countRightNoneZero = 0;
        if ((arr[0] == 0 && arr[arr.length - 1] != 0) || (arr[0] != 0 && arr[arr.length - 1] == 0)) {
            return 0;
        }
        for (int i = 0; i < arr.length / 2 && arr[i] != 0; i++) {
            countLeftNonZero++;

        }
        for (int j = arr.length - 1; j > arr.length / 2 && arr[j] != 0; j--) {
            countRightNoneZero++;
        }
        for (int i = countLeftNonZero - 1; i < arr.length - countRightNoneZero; i++) {
            zeroCount++;
        }

        if (countLeftNonZero == countRightNoneZero && zeroCount >= 3) {
            return 1;
        }
        return 0;
    }
}
