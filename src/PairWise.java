public class PairWise {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 };
        int[] result = pairWiseSum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] pairWiseSum(int[] a) {
        if (a.length == 0 || a.length % 2 != 0) {
            return null;
        }
        int[] arr = new int[a.length / 2];
        int index = 0;
        for (int i = 0; i <= a.length - 2; i = i + 2) {
            arr[index] = a[i] + a[i + 1];
            index++;
        }
        return arr;
    }
}
