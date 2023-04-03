public class WaveArray {
    /*
     * A wave array is defined to an array which does not contain two even numbers
     * or two odd
     * numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0,
     * 5} and {2} are all wave
     * arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6
     * are adjacent to each
     * other.
     * 
     * 
     * Write a function named isWave that returns 1 if its array argument is a Wave
     * array, otherwise it
     * returns 0.
     * If you are programming in Java or C#, the function signature is
     * int isWave (int [ ] a)
     * If you are programming in C or C++, the function signature is
     * int isWave (int a[ ], int len) where len is the number of elements in the
     * array.
     * 3. An array is defined to be a Bean array if it meets the following
     * conditions
     * a. If it contains a 9 then it also contains a 13.
     * b. If it contains a 7 then it does not contain a 16.
     * So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and
     * {3, 6, 9, 5, 7, 13, 6, 17} are
     * Bean arrays. The following arrays are not Bean arrays:
     * a. { 9, 6, 18} (contains a 9 but no 13)
     * b. {4, 7, 16} (contains both a 7 and a 16)
     * Write a function named isBean that returns 1 if its array argument is a Bean
     * array, otherwise it returns
     * 0.
     * If you are programming in Java or C#, the function signature is
     * int isBean (int[ ] a)
     * If you are programming in C or C++, the function signature is
     * int isBean (int a[ ], int len) where len is the number of elements in the
     * array
     */
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 4 };
        System.out.print(isWave(arr));
    }

    public static int isWave(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        if (arr.length == 1) {
            return 1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                return 0;
            }
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
