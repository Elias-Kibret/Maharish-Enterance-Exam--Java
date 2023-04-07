/*It is a fact there exist two numbers X and Y such that
 * 
 * X!+Y!=10; write a method named solve10 that returns the values x and y in 
 * an array 
 * 
 * The notation n! is called n factorial and is equal to n*n-1*n-2*..2*1
 * e.g 5!=5*4*3*2*1=120
 * If you are programming in java or C# , the function prototype is
 * int[] solve10() where the length of the returned array is 2
 * 
 * If you are programming in C++ or C , the function prototype is
 * int * solvve 10 where the length of the returned array is 2.
 */

public class Solve10 {
    public static void main(String[] args) {
        int[] arr = solve10();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // static int[] solve10() {
    // int[] arr = new int[2];
    // int tenFactorial = 1;
    // for (int i = 1; i <= 10; i++) {
    // tenFactorial = i * tenFactorial;

    // }
    // for (int x = 1; x < 10; x++) {
    // int xFactorial = 1;
    // for (int i = 1; i <= x; i++) {
    // xFactorial = i * xFactorial;

    // }
    // int diff = tenFactorial - xFactorial;

    // for (int j = 10 - x; j > 1; j--) {
    // if (diff % j != 0) {
    // break;
    // }

    // diff = diff / j;
    // if (diff < j || diff == 1) {
    // break;
    // }
    // }
    // if (diff == 1) {
    // arr[0] = x;
    // arr[1] = 10 - x;
    // break;

    // }

    // }

    // return arr;
    // }

    static int[] solve10() {
        int factorialX = 1;
        int factorialY = 1;
        int x = 1;
        int y = 1;
        boolean matched = false;
        int tenFactorial = 1;
        int[] result = new int[2];

        for (int i = 1; i <= 10; i++) {
            tenFactorial *= i;
        }

        for (x = 1; x <= 10 && !matched; x++) {
            factorialX *= x;
            factorialY = 1;
            for (y = 1; y <= 10 && !matched; y++) {
                factorialY *= y;
                if (tenFactorial == factorialX + factorialY) {
                    matched = true;
                    break;
                }
            }
        }

        if (matched) {
            result[0] = x;
            result[1] = y;
        } else {
            result[0] = 0;
            result[1] = 0;
        }

        return result;

    }
}
