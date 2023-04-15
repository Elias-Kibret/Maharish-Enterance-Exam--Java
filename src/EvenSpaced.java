public class EvenSpaced {
    public static void main(String[] args) {
        int[] arr = { 200, 10, 151, 160 };
        System.out.println(evenSpaced(arr));
    }

    public static int evenSpaced(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > min) {
                max = arr[i];
            }
        }
        if ((max - min) % 2 == 0) {
            return 1;
        }
        return 0;
    }
}