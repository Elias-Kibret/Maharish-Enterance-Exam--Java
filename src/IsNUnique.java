/*An array is defined to be n-unique if exactly one pair of its elements sum to n. For example, the array {2, 7, 3, 4} is 5-
unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not 5-unique because a[0] + a[1] = 5 and a[0] +
a[2] = 5.


Write a function named isNUnique that returns 1 if its integer array argument is n-unique, otherwise it returns 0. So
isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and
isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.
If you are programming in Java or C#, the function signature is
int isNUnique(int[ ] a, int n)
If you are programming in C or C++, the function signature is
int isNUnique(int a[ ], int len, int n) where len is the number of elements in the array.


*/
public class IsNUnique {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 3, 2, 4 };
        System.out.println(isNUnique(arr, 11));
    }

    static int isNUnique(int[] arr, int n) {
        if (arr.length < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    count++;
                }
            }
            if (count > 1) {
                return 0;
            }
        }
        return 1;
    }
}
