/*2. A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits.
Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it
returns 0.
The function prototype is
int isCubePowerful(int n);
Hint: use modulo 10 arithmetic to get the digits of the number.

Examples:
___________________________________________________________________
if n is             return              because                   
-------------------------------------------------------------------
153                  1             because 153 = 1^3+ 5^3+ 3^3
-------------------------------------------------------------------
370                  1             because 370 = 3^3+ 7^3+ 0^3
-------------------------------------------------------------------
371                  1             because 371 = 3^3+ 7^3+ 1^3
-------------------------------------------------------------------
407                  1             because 407 = 4^3+ 0^3+ 7^3
-------------------------------------------------------------------
87                   0             because 87 != 8^3+ 7^3
-------------------------------------------------------------------
0                    0             because n must be greater than 0.
-------------------------------------------------------------------
-81                  0             because n must be greater than 0.
____________________________________________________________________


*/

public class IsCubePowerfull {
    public static void main(String[] args) {
        int n = 87;
        System.out.print(isCubePowerFull(n));
    }

    public static int isCubePowerFull(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = n;
        while (n != 0) {
            sum = sum - ((n % 10) * (n % 10) * (n % 10));
            n = n / 10;
        }
        return sum == 0 ? 1 : 0;
    }
}
