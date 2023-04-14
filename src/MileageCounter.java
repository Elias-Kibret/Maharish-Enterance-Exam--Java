/* A mileage counter is used to measure mileage in an automobile. A mileage counter
looks something like this  

The above mileage counter says that the car has travelled 5,998 miles. Each mile
travelled by the automobile increments the mileage counter. Here is how the above
mileage counter changes over a 3 mile drive.
*/
public class MileageCounter {
    public static void main(String[] args) {

    }

    public static void updateMileage(int[] a, int miles) {
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles > 9) {
                a[i] = miles % 10;
                miles /= 10;
            } else {
                a[i] = miles;
                miles = 0;
            }
        }
    }
}
