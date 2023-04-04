public class Meeraaa {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 10, -4, 6 };
        System.out.print(isMeera(arr));
    }

    public static int isMeera(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int j = arr.length - 1;
        int countEvenEnd = 0;
        int countOdd = 0;
        for (int i = 0; i <= j; i++) {
            if (arr[0] % 2 != 0 && arr[j] % 2 != 0) {
                return 0;
            } else if (arr[i] % 2 == 0 && arr[j] % 2 != 0 || arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                return 0;
            } else if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                countEvenEnd++;
            } else if (arr[i] % 2 != 0 || arr[j] % 2 != 0) {
                countOdd++;
            }
            j--;

        }
        if (countOdd > 0 && countEvenEnd > 0) {
            return 1;
        }
        return 0;
    }
}
