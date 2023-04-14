/*Define an array to be a 121 array if all elements are either 1 or 2 and the array begins with one or more
1s followed by a one or more 2s and then ends with the same number of 1s that it begins with. Write a
method named is121Array that returns 1 if its array argument is a 121 array, otherwise, it returns 0. */
public class Is121Arrray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 1, 1 };
        System.out.print(is121Array(arr));
    }

    public static int is121Array(int[] a) {
        int count1 = 0, count2 = 0, j = a.length - 1;
        boolean isCount2Started = false;

        for (int i = 0; i <= j; i++) {
            if (a[i] != a[j]) {
                return 0;
            }
            if (a[0] != 1 && a[a.length - 1] != 1) {
                return 0;
            }
            if (a[i] == 1 && a[j] == 1) {
                count1++;

            }
            if (a[i] == 2 && a[j] == 2) {
                isCount2Started = true;
                count2++;
            }
            j--;
        }
        if (count1 > 0 && count2 > 0 && isCount2Started) {
            return 1;
        }
        return 0;
    }
}
