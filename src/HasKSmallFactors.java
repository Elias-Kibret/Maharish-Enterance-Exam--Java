public class HasKSmallFactors {
    public static void main(String[] args) {
        System.out.print(hasKsmallFactors(10, 22));
    }

    public static boolean hasKsmallFactors(int k, int n) {
        if (k >= n) {
            return false;
        }
        int factor = 2;
        while (factor <= k) {
            if (n % factor == 0 && n / factor <= k && factor <= k) {
                return true;
            }
            factor++;
        }
        return false;
    }
}
