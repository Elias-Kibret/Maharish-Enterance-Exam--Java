/*A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the
array. So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. But {8, 3, 4} is not
a Meera array because for n=4,2*n=8 is in the array.
 */
public class Meeraaaa {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4 };
        System.out.println(isMeera(arr));
    }

    public static int isMeera(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 2 * a[i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
