public class ConsecutiveFactored {
    public static void main(String[] args) {

        int n = 90;
        System.out.print(isConsecutiveFactored(n));

    }

    public static int isConsecutiveFactored(int n) {
        if (n < 1) {
            return 0;
        }

        int prevFactor = 2;
        int currentFactor = 2;
        int factor = 2;
        int product = 1;
        int countFactor = 0;
        while (product <= n) {
            System.out.print(product);
            if (product == n) {
                return 1;
            }
            if (n % factor == 0) {
                product = product * factor;

                if (countFactor != 0) {
                    prevFactor = currentFactor;
                    currentFactor = factor;

                    if (currentFactor - prevFactor != 1) {
                        return 0;
                    }
                }
                countFactor++;

            }

            factor++;

        }
        return 1;
    }
}
