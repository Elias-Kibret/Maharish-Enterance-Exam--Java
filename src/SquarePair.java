/*1.Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y and x + y is a perfect square. A perfect
square is an integer whose square root is also an integer, e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not. Write a function


named countSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the
array. For example, if the array is {11, 5, 4, 20} the function would return 3 because the only square pairs that can be constructed from
those numbers are <5, 11>,
<5, 20> and <4, 5>. You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a
perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0.
If you are programming in Java or C#, the function signature is
int countSquarePairs(int[ ] a)
If you are programming in C++ or C, the function signature is
int countSquarePairs(int a[ ], int len) where len is the number of elements in the array.
You may assume that there are no duplicate values in the array, i.e, you don't have to deal with an array like {2, 7, 2, 2}.

*/
public class SquarePair {
    public static void main(String[] args) {
        int[] arr = { 9 };
        System.out.print(squarePair(arr));
    }

    static int squarePair(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isPrefectSquare(arr[i] + arr[i])) {
                    count++;
                }
            }
        }

        return count;
    }

    static boolean isPrefectSquare(int n) {
        int factor = 1;
        int square = 1;
        while (square < n) {
            square = factor * factor;
            factor++;
        }

        return square == n ? true : false;
    }
}
