/*An onion array is an array that satisfies the following condition for all values of j and k:
if j>=0 and k>=0 and j+k=length of array and j!=k then a[j]+a[k] <= 10 

Write a function named isOnionArray that returns 1 if its array argument is an onion array and returns 0 if
it is not.

Your solution must not use a nested loop (i.e., a loop executed from inside another loop). Furthermore,
once you determine that the array is not an onion array your function must return 0; no wasted loops cycles
please!

If you are programming in Java or C#, the function signature is
int isOnionArray(int[ ] a)
If you are programming in C or C++, the function signature is
int isOnionArray(int a[ ], int len) where len is the number of elements in the array a.


_________________________________________________________________________________________________________________________________
a is                     then function returns                           reason
_________________________________________________________________________________________________________________________________
{1, 2, 19, 4, 5}          1                                       because 1+5 <= 10, 2+4 <=10
{1, 2, 3, 4, 15}          0                                       because 1+15 > 10
{1, 3, 9, 8}              0                                       because 3+9 > 10
{2}                       1                                       because there is no j, k where a[j]+a[k] > 10 
                                                                  and j+k=length ofarray and j!=k

{}                        1                                       because there is no j, k where a[j]+a[k] > 10  
                                                                  and j+k=length ofarray and j!=k

{-2, 5, 0, 5, 12}         1                                       because -2+12 <= 10 and 5+5 <= 10
_______________________________________________________________________________________________________________________________


*/

public class IsOnionArray {
    public static void main(String[] args) {
        int[] arr = { -2, 5, 0, 5, 12 };
        System.out.print(isOnionArray(arr));
    }

    public static int isOnionArray(int[] a) {

        int j = 0;
        int k = a.length - 1;

        for (int i = 0; i < Math.floor(a.length / 2); i++) {
            if (a[j] + a[k] <= 10 && j < k) {
                j++;
                k--;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
