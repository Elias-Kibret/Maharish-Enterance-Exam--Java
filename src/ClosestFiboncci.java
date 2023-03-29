public class ClosestFiboncci {
    public static void main(String[] args) {
        System.out.print(closestFibonacci(34));
    }

    public static int closestFibonacci(int n) {
        int prev = 0;
        int fib = 1;
        int sum = 0;
        int closest = 1;
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        else {
            for (int i = 2; i <= n; i++) {
                sum = fib + prev;
                prev = fib;
                fib = sum;
                if (fib <= n) {
                    closest = fib;
                }
            }
        }

        return closest;
    }
}
