/*Write a function named allValuesTheSame that returns 1 if all elements of its
argument array have the same value. Otherwise, it returns 0.
If you are programming in Java or C#, the function signature is
int allValuesTheSame(int[ ] a)
If you are programming in C or C++, the function signature is
int allValuesTheSame(int a[ ], int len) where len is the number of elements in a
Examples: */
public class AllValuesTheSame {
    public static void main(String[] args) {
        int[] arr = { 1, -2343456, 1, -2343456 };
        System.out.println(allValuesTheSame(arr));
    }

    public static int allValuesTheSame(int[] n) {
        if (n.length < 1) {
            return 0;
        }
        if (n.length == 1) {
            return 1;
        }
        int j = n.length - 1;
        for (int i = 1; i <= j; i++) {
            if (n[0] != n[i] && n[0] != n[j]) {
                return 0;

            }
            j--;
        }

        return 1;
    }
}
