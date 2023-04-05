public class FilterArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 9, 6, 11 };
        System.out.print(filterArray(arr));
    }

    public static int filterArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                boolean found11 = false;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 11) {
                        found11 = true;
                    }

                }
                if (!found11) {
                    return 0;
                }

            }
            if (arr[i] == 7) {
                boolean found13 = false;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 13) {
                        found13 = true;
                    }

                }
                if (found13) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
