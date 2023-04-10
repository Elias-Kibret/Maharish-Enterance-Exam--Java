/* An array is defined to be complete if all its elements are greater than 0 and all even numbers that
are less than the maximum even number are in the array.
For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
 a. all its elements are greater than 0
 b. the maximum even integer is 10
 c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.
But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete
because it contains a negative number.
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise
it returns 0.*/

public class completeArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 11, 6, 10, 9, 8 };
        System.out.println(isComplete(arr));
    }

    public static int isComplete(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        int maxEven = 2, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return 0;
            } else if (count == 0 && arr[i] % 2 == 0) {
                maxEven = arr[i];
                count++;
            } else if (count == 1 && arr[i] % 2 == 0) {
                if (arr[i] > maxEven) {
                    maxEven = arr[i];
                }
            }
        }
        if (count == 1) {
            int factor = 2;
            while (factor < maxEven) {
                boolean found = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == factor) {
                        found = true;
                    }
                }
                if (!found) {
                    return 0;
                }
                factor = factor + 2;
            }
        }
        return 1;
    }
}
