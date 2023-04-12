/*A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and
any fancy number other than the first two is sum of the three times previousone and two times the one before
that. See below:
*/

public class FancayArray {
    public static void main(String[] args) {
        System.out.print(isFancyNumber(61));
    }

    public static int isFancyNumber(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prevFancy = 1, currentFancy = 1;
        while (currentFancy <= n) {
            int temp = currentFancy;
            currentFancy = 2 * prevFancy + 3 * currentFancy;
            prevFancy = temp;
            if (currentFancy == n) {
                return 1;
            }
        }
        return 0;
    }
}
