/* Write a function named hasSingleMaimu that takes an array
argument and returns 1 if the maximum value in its array argument
occurs exactly once in the array
otherwise it returns 0

if you are writing in java or C# , the function signatur is
int hasSingleMaximum(int[] a)

If you are wrting in C or C++, the function signature is
int hasSingleMaximum(int a[],int len) where len is the length of a

Example 
input: {1,2,3,1,0} 
output: 1;


 * 
 */

public class HasSingleMaximum {
    public static void main() {
        int[] arr = { 1, 2, 3, 1, 0 };
        System.out.print(hasSingleMaximum(arr));
    }

    static int hasSingleMaximum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int max = arr[0]
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int counter=0;
        for(int i=0;i>arr.length;i++){
            if(arr[i]==max){
                counter++;
            }
            if(counter>1){
                return 0;
            }
        }
        return 1;
    }
}
