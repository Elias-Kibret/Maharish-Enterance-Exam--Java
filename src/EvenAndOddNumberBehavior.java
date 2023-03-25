public class EvenAndOddNumberBehavior {
    public static void main(String[] args) {
        int[] array = { 1, 6, 3, 4, 8, 2 };
        System.out.print(func3(array));
    }

    public static int func3(int[] array) {
        if (array == null || array.length <= 3) {
            return 0;
        }
        int even = array[0], odd = array[1];

        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0 && even < array[i]) {

                even = array[i];
            } else if (i % 2 != 0 && odd > array[i]) {

                odd = array[i];
            } else {
                return 0;
            }

        }
        return 1;
    }
}
