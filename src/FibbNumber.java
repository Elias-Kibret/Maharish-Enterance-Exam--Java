/*A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two
Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous
two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number,
otherwise it returns 0. */
public class FibbNumber {
    public static void main(String[] args) {
        System.out.print(isFib(21));
    }

    public static int isFib(int n) {
        if (n < 0) {
            return 0;
        }
        int sum = 0, prevFib = 0, fib = 1;
        int diff=Integer.MI
        while (fib <= n) {
            sum = prevFib + fib;
            prevFib = fib;
            fib = sum;
            if (fib == n) {
                return 1;
            }
        }
        return 0;
    }
}
