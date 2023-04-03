public class NUpCount {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 5, 3, 2, -3 };
        System.out.print(isPartialSum(arr, 20));
    }

    public static int isPartialSum(int[] a, int n) {
        if (a.length < 1) {
            return 0;
        }
        int prevPairtialSum = 0;
        int currentPairtialSum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            currentPairtialSum = prevPairtialSum + a[i];
            if (prevPairtialSum <= n && currentPairtialSum > n) {
                count++;
            }
            prevPairtialSum = currentPairtialSum;
        }
        return count;
    }
}
