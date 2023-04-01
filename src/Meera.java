/*A Meera number is a number such that the number of nontrivial factors is a factor of the number.
 * For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. (A nontrivial factor 
is a factor other than 1 and the number). Thus 6 has two nontrivial factors. Now, 2 is a factor of 6. 
Thus the number of nontrivial factors is a factor of 6. Hence 6 is a Meera number. Another Meera 
number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. Thus 30 has 6 nontrivial factors. 
Note that 6 is a factor of 30. So 30 is a Meera Number. However 21 is not a Meera number. The 
nontrivial factors of 21 are 3 and 7. Thus the number of nontrivial factors is 2. Note that 2 is not a 
factor of 21. Therefore, 21 is not a Meera number.
Write a function named isMeera that returns 1 if its integer argument is a Meera number, otherwise it 
returns 0.
The signature of the function is
   int isMeera(int n)
 * 
 */
public class Meera {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(isMeera(a));
    }

    public static int isMeera(int n) {
        if (n <= 1) {
            return 0;
        }
        int countFactor = 0, factor = 2;
        while (factor < n) {
            if (n % factor == 0) {
                countFactor++;
            }
            factor++;
        }
        if (n % countFactor == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
