public class ODDHeavy {
    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.print(oddHeavy(arr));
    }

    public static int oddHeavy(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length == 1 && a[0] % 2 == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] > a[i]) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
