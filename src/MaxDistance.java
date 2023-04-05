public class MaxDistance {
    public static void main(String[] args) {
        System.out.println(maxDistance(7));
    }

    public static int maxDistance(int n) {
        if (n < 2) {
            return 0;
        }
        int minFactor = 2;
        int currentFactor = 2;
        int maxFactor = 2;
        int count = 0;
        while (currentFactor < n) {
            if (count == 0) {
                if (n % currentFactor == 0) {
                    minFactor = currentFactor;
                    count++;

                }
            } else if (count > 0 && n % currentFactor == 0) {
                maxFactor = currentFactor;
                count++;
            }
            currentFactor++;
        }
        return count > 0 ? maxFactor - minFactor : -1;
    }
}