/*An array is said to be hollow if it contains 3 or more zeros in the middle that are
preceded and followed by the same number of non-zero elements. Write a function named
isHollow that accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0.
The function signature is
int isHollow(int[ ] a).
Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns true. isHollow ({1,2,0,0,0,3,4,5}) returns false. :
isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns false. isHollow ({1,2, 0,0, 3,4}) returns false. */
public class Hooollow {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 0, 3, 4, 5 };
        System.out.println(isHollow(arr));
    }

    public static int isHollow(int[] a) {
        if (a.length < 5) {
            return 0;
        }
        boolean flagZerocount = false;
        int countNonZero = 0, countZero = 0, j = a.length - 1;
        for (int i = 0; i <= j; i++) {
            if (a[0] == 0 || a[a.length - 1] == 0) {
                return 0;
            }
            if ((a[i] != 0 && a[j] == 0) || (a[i] == 0 && a[j] != 0)) {
                return 0;
            }
            if ((a[i] != 0 && a[j] != 0)) {
                countNonZero++;
                j--;
            }
            if ((a[i] == 0 && a[j] == 0)) {
                flagZerocount = true;
                countZero++;
            }
            if (a[i] != 0 && flagZerocount) {
                return 0;
            }
        }
        if (countNonZero > 1 && countZero >= 0) {
            return 1;
        }
        return 0;
    }
}
