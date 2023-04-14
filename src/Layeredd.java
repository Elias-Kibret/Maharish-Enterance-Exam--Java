public class Layeredd {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        System.out.print(isLayered(arr));
    }

    public static int isLayered(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        if (a.length == 2) {
            if (a[0] == a[1]) {
                return 1;
            } else {
                return 0;
            }
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
            if ((a[i] == a[i + 1]) || (a[i] == a[i - 1])) {
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
