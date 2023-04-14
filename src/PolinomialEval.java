public class PolinomialEval {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        System.out.print(eval(3.0, arr));
    }

    public static double eval(double x, int[] a) {
        if (a.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i] * power(x, i);
        }
        return sum;
    }

    public static double power(double base, int power) {
        double product = 1;
        for (int j = 0; j < power; j++) {
            product = base * product;
        }
        return product;
    }
}
