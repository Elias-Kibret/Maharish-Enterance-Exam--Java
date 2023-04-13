public class WaveArrayy {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 9, 6, 13 };
        System.out.print(isWave(arr));
    }

    public static int isWave(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length == 1) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                return 0;
            }
            if (a[i] % 2 != 0 && a[i + 1] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
