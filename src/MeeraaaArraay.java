/*A Meera array is an array that contains the value 1 if and only if it contains 9. The array {7, 9, 0, 10, 1} is a
Meera array because it contains 1 and 9. The array {6, 10, 8} is a Meera array because it contains no 1 and
also contains no 9.
 */
public class MeeraaaArraay {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 1 };
        System.out.println(isMeeraArray(arr));
    }

    public static int isMeeraArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        boolean found1 = false, found9 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                found1 = true;
            }
            if (arr[i] == 9) {
                found9 = true;
            }
        }
        if ((found1 && found9) || (!found1 && !found9)) {
            return 1;
        }
        return 0;
    }
}
