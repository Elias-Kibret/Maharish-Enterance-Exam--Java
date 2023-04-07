public class IsContinuousFactored {
    public static void main(String[] args) {
        System.out.print(isContinuousFactored(2));
    }

    public static int isContinuousFactored(int n) {
        // find number of factor
        if (n < 1) {
            return 0;
        }

        int[] factors = new int[getLengthofArray(n)];
        int factor = 2, count = 0;
        while (factor < n) {
            if (n % factor == 0) {
                factors[count] = factor;
                count++;
            }
            factor++;

        }

        for (int i = 1; i < factors.length - 1; i++) {

            int m = n;
            count = 0;
            for (int j = i; j < factors.length; j++) {
                if (m == 1) {
                    return 1;
                }
                if (count == 0) {
                    m = m / factors[i - 1];
                    count++;
                }
                if (m % factors[j] == 0 && count >= 1 && factors[j] - factors[j - 1] == 1) {
                    m = m / factors[j];
                } else {
                    break;
                }

            }
        }
        return 0;
    }

    public static int getLengthofArray(int n) {
        int factor = 2, countFactor = 0;
        while (factor < n) {
            if (n % factor == 0) {
                countFactor++;
            }
            factor++;
        }
        return countFactor;
    }
}
