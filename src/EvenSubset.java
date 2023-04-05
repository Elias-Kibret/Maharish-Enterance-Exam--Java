/*. An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n. For
example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12. But 18 is
not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, otherwise it
returns 0 */
public class EvenSubset {
    public static void main(String[] arg) {
        System.out.print(isEvenSubset(18, 32));
    }

    public static int isEvenSubset(int m, int n) {
        if (m < 4 || n < 4) {
            return 0;
        }
        int factor = 2;
        while (factor < m) {
            if (m % factor == 0 && factor % 2 == 0) {
                if (n % factor != 0) {
                    return 0;
                }
            }
            factor++;
        }
        return 1;
    }
}
