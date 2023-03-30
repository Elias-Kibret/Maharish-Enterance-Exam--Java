/*1. Write a function named isSquare that returns 1 if its integer argument is a square of some integer,
otherwise it returns 0. Your function must not use any function or method (e.g. sqrt) that comes with a
runtime library or class library! You will need to write a loop to solve this problem. Furthermore,
your method should return as soon as the status of its parameter is known. So once it is known that the
input parameter is a square of some integer, your method should return 1 and once it is known that the input
is not a square, the method should return 0. There should be no wasted loop cycles, your method should be
efficent!

The signature of the function is
int isSquare(int n)
Examples:
_____________________________________________________________________________________________________________
if n is                      return           reason
_____________________________________________________________________________________________________________
4                             1                 because 4 = 2*2
25                            1                 because 25 = 5*5
-4                            0                 because there is no integer 
                                                that when squared equals -4. (note, -2 squared is 4 not -4)
8                             0                 because the square root of 8 is not an integer.
0                             1                 because 0 = 0*0
______________________________________________________________________________________________________________

*/

public class IsSquare {
    public static void main(String[] args) {
        System.out.print(isSquare(-4));
    }

    public static int isSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int squareRoot = 0;
        while (squareRoot <= n) {
            if (squareRoot * squareRoot == n) {
                return 1;
            }
            squareRoot++;
        }
        return 1;
    }
}
