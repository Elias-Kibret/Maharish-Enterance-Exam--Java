public class AllValuesTheSameee {
    public static void main(String[] args) {
        int[] arr = { 1, -2343456, 1, -2343456 };
        System.out.print(allValuesTheSame(arr));
    }

    public static int allValuesTheSame(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length == 1) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[0] != a[i]) {
                return 0;
            }
        }
        return 1;
    }
}
