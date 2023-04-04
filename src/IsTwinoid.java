/*
 A twinoid is defined to be an array that has exactly two even values that are adjacent to one another. For example {3, 3,
2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and they are adjacent to one another. The
following arrays are not twinoid arrays.
{3, 3, 2, 6, 6, 7} because it has three even values.
{3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
{3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isTwinoid (int [ ] a);
If you are programming in C or C++, the function signature is
int isTwinoid(int a[ ], int len) where len is the number of elements in the array

*/
public class IsTwinoid {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 2, 6, 7 };
        System.out.print(isTwinoid(arr));

    }

    public static int isTwinoid(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int countEven = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] % 2 == 0 && arr[j + 1] % 2 == 0) {
                countEven = countEven + 2;
                j = j + 1;
            } else if (arr[j] % 2 == 0) {
                countEven++;
            }
            if (countEven > 2) {
                return 0;
            }
        }
        return 1;
    }

}
