/*1. Write a function named countDigit that returns the number of times that a given digit appears in a positive
number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121. Other examples:
countDigit(33331, 3) returns 4
countDigit(33331, 6) returns 0
countDigit(3, 3) returns 1
 */
public class CountDigit {
    public static void main(String[] args) {
        System.out.print(countDigit(33331, 3));
    }

    public static int countDigit(int n, int digit) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        while (n != 0) {
            if (n % 10 == digit) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
