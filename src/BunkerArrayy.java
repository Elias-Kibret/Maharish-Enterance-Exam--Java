public class BunkerArrayy {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 7, 3 };
        System.out.println(isBunkerArray(arr));
    }

    public static int isBunkerArray(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0 && isPrime(arr[i + 1])) {
                return 1;
            }
        }
        return 0;
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
