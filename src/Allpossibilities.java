public class Allpossibilities {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3 };
        System.out.print(isAllPossibities(arr));
    }

    public static int isAllPossibities(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = i;
        }
        for (int j = 0; j < result.length; j++) {
            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0 || a[i] > a.length - 1) {
                    return 0;
                }
                if (result[i] == a[j]) {
                    found = true;
                }

            }
            if (!found) {
                return 0;
            }
        }

        return 1;
    }
}
