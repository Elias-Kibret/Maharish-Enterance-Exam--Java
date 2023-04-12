import java.util.function.BiPredicate;

public class BeeeanArray {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 18 };
        System.out.print(isBeanArray(arr));
    }

    public static int isBeanArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                boolean found13 = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 13) {
                        found13 = true;
                    }
                }
                if (!found13) {
                    return 0;
                }
            }
            if (arr[i] == 7) {
                boolean found16 = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 16) {
                        found16 = true;
                    }
                }
                if (found16) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
