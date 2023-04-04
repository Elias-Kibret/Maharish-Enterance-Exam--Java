public class IsSym {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 8, 9, 11, 13, 10 };
        System.out.println(isSym(arr));
    }

    public static int isSym(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            if ((arr[i] % 2 == 0 && arr[j] % 2 != 0) || (arr[i] % 2 != 0 && arr[j] % 2 == 0)) {
                return 0;
            }
            j--;
        }
        return 1;
    }
}
