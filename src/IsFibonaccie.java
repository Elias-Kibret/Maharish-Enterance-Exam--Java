/*3. The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second
numbers are 1 and after that ni

= ni-2 + ni-1, e.g., 34 = 13 + 21. Write a method with signature
int isFibonacci(int n) which returns 1 if its argument is a number in the Fibonacci sequence,
otherwise it returns 0. For example, isFibonacci(13) returns a 1 and isFibonacci(27) returns a 0.
Your solution must not use recursion because unless you cache the Fibonacci numbers as you
find them, the recursive solution recomputes the same Fibonacci number many times.


*/
public class IsFibonaccie {
    public static void main(String[] args) {
        int a = 27;
        System.out.print(isFibonaccie(a));

    }

    public static int isFibonaccie(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev = 0;
        int fib = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = prev + fib;
            prev = fib;
            fib = sum;
            if (fib == n) {
                return 1;
            } else if (fib > n) {
                return 0;
            }
        }

        return 0;

    }
}