/* . A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The
function signature is
int isNormal(int n)

Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is
not a normal number since 5 is an odd factor. 
*/
public class Normal {
    public static void main(String[] args) {
        int normal = 9;
        System.out.print(normal(normal));
    }

    public static int normal(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                if (factor % 2 != 0) {
                    return 0;
                }
            }
            factor++;
        }
        return 1;
    }
}
