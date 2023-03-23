/* Write a function that takes an array of integers as an argument and
 * a value based on the sums of the even and odd numbers in the array
 * Let X=the sum of the odd numbers in the array and let Y=the sum of the even 
 * numbers
 * The function should return X-Y
 * The signature of the function is 
 * int f(int[] a)
 * 
 * Examples
 * input : {1}
 * output :1
 * 
 * input:{1,2}
 * output: -1
 * 
 * input:{1,2,3,4}
 * output: -2
 */

public class ValueBasedOnTheSumsOfTheEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.print(function(arr));
    }

    static int function(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        return oddSum - evenSum;
    }
}
