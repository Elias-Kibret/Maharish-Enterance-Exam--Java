/* . A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and
any fancy number other than the first two is sum of the three times previousone and two times the one before
that.

3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.
The signature of the function is
 int isFancy(int n)

*/
public class FancyNumber {
    public static void main(String[] arg) {
        System.out.print(isFancy(5));
    }

    public static int isFancy(int n) {
        if (n < 1) {
            return 0;
        }
        int prevFancy = 1, currentFancy = 1, result = 0;
        while (result < n) {

            result = 2 * prevFancy + 3 * currentFancy;
            prevFancy = currentFancy;
            currentFancy = result;

        }
        if (result == n) {
            return 1;
        } else {
            return 0;
        }

    }
}