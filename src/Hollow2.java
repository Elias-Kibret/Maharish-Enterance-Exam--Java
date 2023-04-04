public class Hollow2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 0, 3, 4, 5 };
        System.out.println(isHollow(arr));
    }

    public static int isHollow(int[] a) {
        if (a.length < 3 || a[0] == 0 && a[a.length - 1] != 0 || a[0] != 0 && a[a.length - 1] == 0) {
            return 0;
        }
        int conntLeftNoneZero = 0, countRightNoneZero = 0, countMiddleZero = 0;
        for (int i = 0; i < a.length / 2 && a[i] != 0; i++) {
            conntLeftNoneZero++;
        }
        for (int j = a.length - 1; j > a.length / 2 && a[j] != 0; j--) {
            countRightNoneZero++;
        }
        for (int j = conntLeftNoneZero - 1; j < a.length - countRightNoneZero; j++) {
            if (a[j] != 0) {
                break;
            }
            countMiddleZero++;
        }
        if (countMiddleZero < 0 || conntLeftNoneZero != countRightNoneZero) {
            return 0;
        }
        return 1;

    }
}
