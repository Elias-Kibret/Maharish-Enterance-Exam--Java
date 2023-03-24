/*An array can hold the digits of a number , For example
the digits of the number 32053 are stored in the array {3,2,0,5,3}
Write a method call repsEqual that takes an array and an integer
and returns 1 if the array contains only the digits of the number in the same order
that they apper in the number
Otherwise is returns o

If you are programming in java or C# , the function prototype is 
int repsEqual(int[] a,int n)

If you are programming in C++ or C ,the function prototype is
int repsEqual(int a[],int len,int n)
 *where len is the number of elements in the array

 */

public class RepsEqual {
    public static void main(String[] args) {
        int num = 32553;
        int[] arr = { 3, 2, 5, 5, 3 };
        // System.out.print(num / 10);
        System.out.print(repsequal(arr, num));
    }

    public static int repsequal(int[] arr, int num) {
        int x;
        for (int i = arr.length - 1; i >= 0; i--) {
            x = num % 10;
            num = num / 10;
            if (x != arr[i]) {
                return 0;
            }
        }

        return 1;
    }
}
