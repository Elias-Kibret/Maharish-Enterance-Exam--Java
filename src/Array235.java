public class Array235 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print(is235Array(arr));
    }

    public static int is235Array(int[] a) {
        if (a.length < 1) {
            return 1;
        }
        int divisbleBy235 = 0;
        int notByDivisble235 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                divisbleBy235++;
            }
            if (a[i] % 3 == 0) {
                divisbleBy235++;
            }
            if (a[i] % 5 == 0) {
                divisbleBy235++;
            }
            if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
                notByDivisble235++;
            }
        }

        if ((divisbleBy235 + notByDivisble235) == a.length) {
            return 1;
        } else {
            return 0;
        }

    }
}
