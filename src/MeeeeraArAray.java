public class MeeeeraArAray {
    public static void main(String[] args) {
        int[] arr = { 7, 9, 0,
                10, 1 };
        System.out.print(isMeera(arr));
    }

    public static int isMeera(int[] arr) {
        boolean found1 = false, found9 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                found1 = true;
            }
            if (arr[i] == 9) {
                found9 = true;
            }
        }
        if ((found1 && found9) || (!found1 && !found9)) {
            return 1;
        }
        return 0;
    }
}
