/*A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two
Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous
two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number,
otherwise it returns 0.
The signature of the function is
 int isFibonacci (int n)
 */
public class FibNumber {
    public static void main(String[] args) {
        System.out.print(isFibonacciNumbera(21));
    }

    public static int isFibonacciNumbera(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0, prev = 0, fib = 1;
        while (fib <= n) {
            sum = fib + prev;
            prev = fib;
            fib = sum;
            if (n == fib) {
                return 1;
            }
        }
        return 0;
    }
}
