public class LargestFactor {
    public static void main(String[] args) {
        int number = 00012;
        System.out.println(func1(number));
    }

    public static int func1(int number) {
        number = Integer.parseInt(Integer.toString(number, 8));
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        int divisor = 2;
        while (divisor <= number) {
            if (number % divisor == 0) {
                return number / divisor;
            }
            divisor++;
        }
        return 0;
    }
}
