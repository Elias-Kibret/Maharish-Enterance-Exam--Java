/* Write a function named eval that returns the value of the polynomial 

If you are programming in Java or C#, the function signature is
double eval(double x, int[ ] a)
If you are programming in C or C++, the function signature is
double eval(double x, int a[ ], int len) where len is the number of elements in the array
Examples:






*/

public class Polynomial {
    public static void main(String[] args) {
        double x = 2.0;
        int[] arr = { 3, -2, -1 };
        System.out.print(eval(x, arr));
    }

    public static double eval(double x, int[] a) {
        if (a.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int j = a.length - 1; j >= 0; j--) {
            sum = sum + a[j] * powerProduct(x, j);
        }
        return sum;
    }

    public static double powerProduct(double base, int power) {
        double product = 1;
        for (int i = 0; i < power; i++) {
            product = product * base;
        }
        return product;
    }
}
