public class Check {
    public static void main() {
        int num = 32053;
        int[] arr = { 3, 2, 0, 5, 3 };
        System.out.print(repsequal(arr, num));
    }

    public static int repsequal(int[] arr, int num) {
        int x;
        for (int i = arr.length - 1; i <= 0; i--) {
            x = num % 10;
            num = num / 10;
            if (x != arr[i]) {
                return 0;
            }
        }

        return 1;
    }
}
