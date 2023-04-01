public class OddHeavy {
    public static void main(String[] args) {
        int[] arr = { 11, 4, 9, 2, 8 };
        System.out.print(isOddHeavy(arr));
    }

    public static int isOddHeavy(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            if (arr[0] % 2 == 0) {
                return 0;
            } else {
                return 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[j] > arr[i]) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
