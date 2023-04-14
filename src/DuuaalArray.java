public class DuuaalArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 5, 5 };
        System.out.print(isDualArray(arr));
    }

    public static int isDualArray(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 2) {
                    return 0;
                }
            }
            if (count != 2) {
                return 0;
            }
        }
        return 1;
    }
}
