public class Fancccy {
    public static void main(String[] args) {
        System.out.print(isFancy(62));
    }

    public static int isFancy(int n) {
        if (n < 1) {
            return 0;
        }
        int prevFancy = 1, currentFancy = 1;
        while (currentFancy <= n) {
            int temp = currentFancy;
            currentFancy = 2 * prevFancy + 3 * currentFancy;
            prevFancy = temp;
            if (currentFancy == n) {
                return 1;
            }
        }
        return 0;
    }
}
