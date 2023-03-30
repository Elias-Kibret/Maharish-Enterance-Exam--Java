public class AllValuesTheSame {
    public static void main(String[] args) {
        int[] arr = { 1, -2343456, 1, -2343456 };
        System.out.println(allValuesTheSame(arr));
    }

    public static int allValuesTheSame(int[] n) {
        if (n.length < 1) {
            return 0;
        }
        if (n.length == 1) {
            return 1;
        }
        int j = n.length - 1;
        for (int i = 1; i <= j; i++) {
            if (n[0] != n[i] && n[0] != n[j]) {
                return 0;

            }
            j--;
        }

        return 1;
    }
}
