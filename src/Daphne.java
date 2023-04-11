/* A Daphne array is defined to be an array that contains at least one odd number and begins and
ends with the same number of even numbers.
So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even
numbers and ends with three even numbers and it contains at least one odd number
The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends
with three even numbers.
Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it
returns 0.
If you are writing in Java or C#, the function signature is
 int isDaphne (int[ ] a) */
public class Daphne {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 11, 12, 6 };
        System.out.print(isDaphne(arr));
    }

    public static int isDaphne(int[] arr) {
        int countEven = 0, countOdd = 0, j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                countEven++;
            }
            if (i > 0 && countEven == 0) {
                return 0;
            }
            if ((arr[i] % 2 == 0 && arr[j] % 2 != 0) || (arr[i] % 2 != 0 && arr[j] % 2 == 0)) {
                return 0;
            }
            if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                countOdd++;
            }
            j--;
        }
        if (countEven == 0 && countOdd == 0) {
            return 0;
        }
        return 1;
    }
}
