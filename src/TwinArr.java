public class TwinArr {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 14, 7, 18, 67 };
        System.out.print(isTwinArray(arr));
    }

    public static int isTwinArray(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (isPrime(arr[i]) && (isPrime(arr[i] - 2) || isPrime(arr[i] + 2))) {
                boolean found = false;
                for (int j = 0; j < arr.length; j++) {
                    if (isPrime(arr[j])) {

                        if (arr[j] == arr[i] - 2 || arr[j] == arr[i] + 2) {
                            found = true;
                        }
                    }
                }
                if (!found) {
                    return 0;
                }
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
