/* Write a method named is isDivisble that takes an integer array and
returns 1 if all its elements are divided by the divisor with
no remainder Otherwise it returns o

If you are programming in java or C#, the function signature is 

 int isDivisible(int a[], int divisor)

 If you are programming in C or C++ , the function signatur is
 in isDivisible(int a[],int len,int divisor) where len is the
 number of elements in the array

 Examples
input {3,3,6,36} 3
output:1

input {4} 2
output: 1

input: {3,4,3,6,36} 3
output :3
 */

public class IsDivisible {
    public static void main() {
        int[] arr = { 3, 3, 6, 1 };
        int divisor = 3;
        System.out.print(isDivisible(arr, divisor));
    }

    static int isDivisible(int[] arr, int divisor) {
        if (arr.length > 0 && divisor != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor != 0) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
