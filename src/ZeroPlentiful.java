/* 2. A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9.
For example 24 is digit-increasing because it equals 2 + 22 (here n = 2)
Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it
returns 0.
The signature of the method is
int isDigitIncreasing(int n)


Examples
__________________________________________________________________________
if n is      then function returns            reason
__________________________________________________________________________
7            1                     because 7 = 7 (here n is 7)
36           1                     because 36 = 3 + 33
984          1                     because 984 = 8 + 88 + 888
7404         1                     because 7404 = 6 + 66 + 666 + 6666
__________________________________________________________________________


*/
public class ZeroPlentiful {
    public static void main(String[] args) {
        int number = 36;

        System.out.print(isDigitIncreasing(number));
    }

    public static int isDigitIncreasing(int n) {

        int digits = 0;
        int temp = 1;
        while (temp <= n) {
            digits++;
            temp *= 10;
        }
        int[] sum = new int[digits];
        for (int j = 1; j <= 9; j++) {
            String num = "";
            for (int i = 0; i < digits; i++) {
                num = num + Integer.toString(j);
                sum[i] = Integer.parseInt(num);
            }
            int result = 0;
            for (int i = 0; i < sum.length; i++) {
                result = result + sum[i];
            }
            if (result == n) {
                return 1;
            }

        }
        return 0;
    }
}
