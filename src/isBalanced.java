public class isBalanced {
    public static void main(String[] args) {
        int[] arr = { -2,
                3, 2, -4 };
        System.out.print(isBalanced(arr));
    }

    public static int isBalanced(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        if (sum == 0) {
            return 1;
        }
        return 0;
    }
}
