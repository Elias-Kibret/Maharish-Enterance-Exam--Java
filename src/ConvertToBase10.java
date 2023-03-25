public class ConvertToBase10 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1 };
        int base = 6;
        System.out.print(convertToBase10(arr, base));
    }

    static int convertToBase10(int[] arr, int base) {
        int sum = 0;
        int start = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > base) {
                return 0;
            }

            sum = sum + arr[i] * power(base, start);
            start++;
        }
        return sum;
    }

    static int power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        int product = 1;
        for (int i = 0; i < power; i++) {
            product = product * base;
        }
        return product;
    }
}
