public class TwoEvenOddNumbers {
    public static void main(String[] arg) {
        int[] arr = { 7, 2, 9, 10, 5 };
        System.err.println(isNotTwoEvenOddNumbers(arr));
    }

    public static int isNotTwoEvenOddNumbers(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                return 0;
            } else if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
