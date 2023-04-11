public class OdddHeavy {
    public static void main(String[] args) {
        int[] arr = { -2, -4, -6, -8, -11 };
        System.out.println(isOddHeavy(arr));
    }

    public static int isOddHeavy(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[j] > arr[i]) {
                        return 0;
                    }
                }
            }
        }
        if (oddCount == 0) {
            return 0;
        }
        return 1;
    }
}
