/*Write a function named nextPrefectSquare that returns the first perfect square that is greate than 
 * its integer argument.A perfect square is an integer that is equal to some integer square.For example 16
 * is a prefect square becaise 16=4*4.However 15 is not a perfect square because there is no
 * integer n such that 15=*n
 * 
 */

public class NextPrefectSquare {
    public static void main(String[] args) {
        int n = 6;
        System.out.print(nextPrefectSquare(n));
    }

    public static int nextPrefectSquare(int n) {
        int square = 0, squareRoot = 0;
        while (square <= n) {
            square = squareRoot * squareRoot;
            squareRoot++;
        }
        return square;
    }
}
