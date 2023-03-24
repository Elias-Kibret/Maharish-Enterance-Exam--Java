public class ArrayContainingAllElementsCommon {
    public static void main(String[] args) {
        int[] first = { 1, 2, 4, 6 };
        int[] second = { 1, 2, 3 };
        int[] result = commonArray(first, second);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    static int[] commonArray(int[] first, int[] second) {
        int[] common = new int[first.length];
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }
        int counter = 0;

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    common[counter] = first[i];
                    counter++;
                    break;

                }

            }
        }
        if (common.length == 0) {
            return new int[0];
        } else {
            int[] result = new int[counter];
            for (int i = 0; i < counter; i++) {
                result[i] = common[i];

            }
            return result;
        }
    }
}