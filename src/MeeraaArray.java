/*2. Define a Meera array to be an array a if it satisfies two conditions:
(a) a[i] is less than i for i = 0 to a.length-1.
(b) sum of all elements of a is 0.
For example, {-4, 0, 1, 0, 2, 1} is a Meera array because
-4 = a[0] < 0
0 = a[1] < 1
1 = a[2] < 2
0 = a[3] < 3
2 = a[4] < 4
16
1 = a[5] < 5
and -4 + 0 + 1 + 0 + 2 + 1 = 0 */
public class MeeraaArray {
    public static void main(String[] args) {
        int[] arr = { -8, 0, 0, 8, 0 };
        System.out.print(isMeeraArray(arr));
    }

    public static int isMeeraArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = arr[arr.length - 1];
        for (int j = 0; j <= arr.length - 1; j++) {
            if (arr[j] < j) {
                sum = sum + arr[j];
            } else {
                return 0;
            }
        }
        if (sum == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
