public class TwinArray {
    public static void main(String[] args) {
        int[] arr = { 11, 9, 12, 13, 23 };
        System.out.print(isTwin(arr));
    }

    public static int isTwin(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            if (isPrime(arr[i])) {

                for (int j = 0; j < arr.length; j++) {
                    if (isPrime(arr[i] - 2) && arr[i] - 2 == arr[j] || isPrime(arr[i] + 2) && arr[i] + 2 == arr[j]) {
                        found = true;
                    }
                }

            }
            if (!false) {
                return 0;
            }

        }
        return 1;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                return false;
            }
            factor++;

        }
        return true;

    }
}
