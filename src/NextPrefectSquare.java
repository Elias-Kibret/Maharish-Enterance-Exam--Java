/*Write a function named nextPrefectSquare that returns the first perfect square that is greate than 
 * its integer argument.A perfect square is an integer that is equal to some integer square.For example 16
 * is a prefect square becaise 16=4*4.However 15 is not a perfect square because there is no
 * integer n such that 15=*n
 * 
 */

public class NextPrefectSquare {
    public static void main(String[] args) {
        int n = 0;
        System.out.print(nextPrefectSquare(n));
    }

    public static int nextPrefectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int factor = 1;
        int square = 1;
        while (square <= n) {
            square = factor * factor;
            factor++;
        }
        return square;
    }
}
