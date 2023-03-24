/*The sum factor of an array is defined to be the number of times
that the sum of the array appears as an element of the
array. so the sum factor of {1,-1,1,-1,1,-1,1} is 4 
because the sum of the elements of the array is 1 and 1 appears four times in the
array

and the sum factor of {1,2,3,4} is 0 because the sum of the elements of the array is 10
and 10 does not occur as an element of the array
The sum factor of the empty array {} is define to be o

Write a function named sumfactor that returns the sum factor of its 
array argument


 *
 */

public class TheSumFactor {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0 };
        System.out.print(sumFactor(arr));
    }

    static int sumFactor(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        int occurance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (total == arr[i]) {
                occurance++;
            }
        }
        return occurance;
    }
}
