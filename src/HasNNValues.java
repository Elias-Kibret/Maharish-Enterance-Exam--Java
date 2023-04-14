/*Write a function named hasNValues which takes an array and an integer n as
arguments. It returns true if all the elements of the array are one of n different values.
If you are writing in Java or C#, the function signature is
int hasNValues(int[ ] a, int n)  */
public class HasNNValues {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 8, 1, 1, 1, 3, 3 };
        System.out.println(hasNValues(arr));
    }

    public static int hasNValues(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j < i) {
                    break;
                }
                if (arr[i] == arr[j] && j >= i) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
