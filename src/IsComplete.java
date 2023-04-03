/*3. An array is defined to be complete if the conditions (a), (d) and (e) below hold.
 a. The array contains even numbers
 b. Let min be the smallest even number in the array.
 c. Let max be the largest even number in the array.
 d. min does not equal max
 e. All numbers between min and max are in the array
 
For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
 a. The array contains even numbers
 b. 2 is the smallest even number
 c. 8 is the largest even number
 d. 2 does not equal 8
 e. the numbers 3, 4, 5, 6, 7 are in the array.
Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise
it returns 0.
If you are writing in Java or C#, the function signature is
 int isComplete (int[ ] a)
If you are writing in C or C++, the function signature is
 int isComplete (int a[ ], int len) where len is the number of elements in the array.
 */

public class IsComplete {
    public static void main(String[] args) {
        int[] arr = { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 };
        System.out.println(isComplete(arr));
    }

    public static int isComplete(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int min = 0, max = 0, countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (countEven == 0 && arr[i] % 2 == 0) {
                max = arr[i];
                min = arr[i];
                countEven++;
            }
            if (countEven != 0 && arr[i] % 2 == 0) {
                if (arr[i] > min) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                countEven++;
            }
        }
        System.out.println(min);
        if (max > min && countEven > 1) {
            for (int i = min; i <= max; i++) {
                boolean isFound = false;
                for (int j = 0; j < arr.length; j++) {
                    if (i == arr[j]) {
                        isFound = true;
                    }
                }
                if (!isFound) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
