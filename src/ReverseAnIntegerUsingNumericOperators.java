public class ReverseAnIntegerUsingNumericOperators {
    public static void main(String[] args) {
        // System.out.print(f(1234));
        System.out.println(reverseInt(12345));
    }

    static int reverseInt(int integer) {
        int sign = 1;
        if (integer == 0) {
            return 0;
        }
        if (integer < 0) {
            sign = -1;
            integer = sign * integer;
        }
        int reverseInt = 0;
        while (integer != 0) {
            reverseInt = (reverseInt * 10) + (integer % 10);
            integer = integer / 10;
        }
        return sign * reverseInt;
    }
}
