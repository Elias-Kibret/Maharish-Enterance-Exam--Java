/* */
public class Centered {
    public static void main(String[] args) {
        int[] arr = { 16, 6, 2, 3 };
        System.out.println(isCentered(arr));
    }

    public static int isCentered(int[] arr) {
        if (arr.length == 0 || arr.length % 2 == 0) {
            return 0;
        }
        int j = arr.length - 1;
        int n = arr[arr.length - 1];
        for (int i = 0; i < j; i++) {
            if (arr[i] > n || arr[j] > n) {
                return 0;
            }
            j--;
        }
        return 1;
    }
}
