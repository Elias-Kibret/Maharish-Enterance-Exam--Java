public class MeeeeraArray {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 10, -4, 6 };
        System.out.println(isMeera(arr));
    }

    public static int isMeera(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int countEven = 0, oddCount = 0, j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                countEven++;
            }
            if (i > 0 && countEven == 0) {
                return 0;
            }
            if (i > 0 & countEven > 0) {
                if ((arr[i] % 2 == 0 && arr[j] % 2 != 0) || (arr[i] % 2 != 0 && arr[j] % 2 == 0)) {
                    return 0;
                }
            }
            if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                oddCount++;
            }
            j--;
        }
        if (countEven > 0 && oddCount > 0) {
            return 1;
        }
        return 0;
    }
}
