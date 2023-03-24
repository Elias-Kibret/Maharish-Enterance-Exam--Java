public class FindCentered15FromTheGivenArray {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 4, 1, 6, 9 };
        System.out.println(isCenter15(arr));
    }

    static int isCenter15(int[] arr) {
        int total = 0;
        int start = 0;
        int lastIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        if (total >= 15) {
            while (start < lastIndex && total != 15) {
                total = total - arr[start] - arr[lastIndex];
                start++;
                lastIndex--;
            }
        }
        return total == 15 ? 1 : 0;
    }
}
