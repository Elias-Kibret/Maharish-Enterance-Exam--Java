public class Matches {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] p = { 3, -2, 3 };
        System.out.println(matches(arr, p));
    }

    static int matches(int[] arr, int[] p) {
        int index = 0;
        for (int i = 0; i < p.length; i++) {
            int sign = p[i] > 0 ? 1 : -1;
            for (int j = 0; j < sign * p[i]; j++) {
                if (arr[index] * sign < 0) {
                    return 0;
                } else if (arr[index] * sign > 0) {
                    index++;
                } else {
                    return 0;
                }
            }
        }

        return 1;
    }
}
