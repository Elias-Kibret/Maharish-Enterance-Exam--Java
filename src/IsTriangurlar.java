/*1. A number n is triangular if n == 1 + 2 +...+j for some j. Write a function
int isTriangular(int n)
that returns 1 if n is a triangular number, otherwise it returns 0. The first 4 triangular
numbers are 1 (j=1), 3 (j=2), 6, (j=3), 10 (j=4).

 */

public class IsTriangurlar {
    public static void main(String[] args) {
        System.out.print(isTriangular(9));
    }

    public static int isTriangular(int n) {
        if (n < 1) {
            return 0;
        }
        int j = 1, sum = 0;
        while (sum <= n) {
            sum = sum + j;
            j++;
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }
}
