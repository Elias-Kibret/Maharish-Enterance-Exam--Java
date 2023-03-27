/* 3. Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers
between m and n inclusive. Furthermore, the array must be in ascending order and contain only those
integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5
sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the
0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order. */
public class IsSequencedArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int m = 1;
        int n = 5;
        System.out.print(isSequencedArray(a, m, n));
    }

    public static int isSequencedArray(int[] a, int m, int n) {

        if (a.length < 1 || a[0] != m || a[a.length - 1] != n) {
            return 0;
        }
        for (int j = 0; j < a.length - 1; j++) {
            int diff = a[j + 1] - a[j];
            if (diff == 1 || diff == 0) {
                continue;

            } else {
                return 0;
            }
        }
        return 1;
    }
}