public class ValueBasedOnTheSumsOfTheEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.print(function(arr));
    }

    static int function(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        return oddSum - evenSum;
    }
}
