public class FibonnacciNimber {
    public static void main(String[] args) {
        System.out.print(isFibonacci(8));
    }

    public static int isFibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int prev = 0, sum = 0, fib = 1;
        while (fib <= n) {
            sum = fib + prev;
            prev = fib;
            fib = sum;
            if (fib == sum) {
                return 1;
            } else if (fib > sum) {
                return 0;
            }
        }
        return 1;
    }
}