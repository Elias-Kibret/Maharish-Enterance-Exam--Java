public class Twinoid {
    public static void main(String[] args) {
        int[] arr = { 3,
                3, 2, 6, 7 };
        System.out.print(isTwinoid(arr));
    }

    public static int isTwinoid(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int countEven = 0;
        boolean adjacent = false;
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                countEven++;
            }
            if (a[j] % 2 == 0 && a[j + 1] % 2 == 0) {
                adjacent = true;
            }
        }
        if (countEven == 2 && adjacent) {
            return 1;
        }
        return 0;
    }
}
