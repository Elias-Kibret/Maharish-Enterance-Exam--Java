/*Consider the following algorithm
 * 
 * Start with a postive number n
 * if n is even then divide by 2
 * if n is odd then multipy by 3 and add 1
 * continue this until n becomes a
 * 
 * The guthrie sequence of a positive number n is defined to be the numbers 
 * generated by the above algorithm
 * 
 * For example , the Guthrie seqquence of the number 7 is 
 * 
 * &,22,11,34,52,26,13,40,20,10,5,18,8,4,2,1
 * 
 * It's easy to see this sequence was generated from the number 7 by the
 * above  algorithm.Since 7 is odd multiply by 3 and add 1 to get 22 whcih is
 * the second number of the sequence.sicne 22 is even ,divide by 2 to get 11 which is the third number of the sequence.
 * 11 is odd so multiply by 3 and add 1 to get 33 which is the fourth number of the sequence and so on
 * 
 * Note : The first number of a Guthrie sequence is always the number that generate
 * the sequence and the last number is always 1
 * 
 * Write a function named isGuthrieSequence which returns 1 if the 
 * elements of the array form a guthrie sequence .Otherwise it returns 0
 * 
 * 
 *  
 * 
 * 
 */

public class GuthrieSequence {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 1 };
        System.out.print(isGutherieSequence(arr));
    }

    static int isGutherieSequence(int[] arr) {
        if (arr.length < 2 || arr[arr.length - 1] != 1) {
            return 0;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] % 2 == 0) {
                if (arr[i + 1] != arr[i] / 2) {
                    return 0;
                }
            } else {
                if (arr[i + 1] != (arr[i] * 3 + 2)) {
                    return 0;
                }

            }

        }

        return 1;
    }
}
