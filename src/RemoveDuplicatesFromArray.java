/*Write a function to remove duplicates from a give arrray of intger
Function signature 
int[] f(int[] a)
 * 
 * 
 */

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] sample = { 1, 2, 3, 3, 5, 6, 3 };
        int[] result = removeduplicates(sample);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    static int[] removeduplicates(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int[] arr = new int[a.length];

        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (a[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                arr[counter] = a[i];
                counter++;

            }
        }
        if (counter == arr.length) {
            return arr;
        } else {
            int[] outPut = new int[counter];
            for (int i = 0; i < counter; i++) {
                outPut[i] = arr[i];
            }
            return outPut;
        }

    }
}
