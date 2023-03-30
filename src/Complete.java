public class Complete {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 23, 13, 107, -99, 97, 81 };
        System.out.print(isComplete(arr));
    }

    public static int isComplete(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        boolean isEven = false;
        boolean isSquere = false;
        boolean isSumTo8 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                isEven = true;
            }
            int squareRoot = 0;
            while (squareRoot <= arr[i]) {
                if (squareRoot * squareRoot == arr[i]) {
                    isSquere = true;
                    System.out.println(squareRoot);
                }
                squareRoot++;
            }

            if (i <= arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] + arr[i] == 8) {
                        isSumTo8 = true;
                    }
                }
            }
        }
        if (isEven && isSquere && isSumTo8) {
            return 1;
        } else {
            return 0;
        }

    }
}