public class StantonMeasure {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 2, 2, 1, 1, 4 };
        System.out.print(stantonMeasure(arr));
    }

    static int stantonMeasure(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        int secondCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == arr[i]) {
                secondCount++;
            }
        }
        return secondCount;
    }
}
