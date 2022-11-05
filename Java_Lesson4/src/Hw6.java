import java.util.Arrays;
import java.util.Scanner;

public class Hw6 {
    /**
     * Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1] và 2 số nguyên b, c (b < c).
     * Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c]
     */
    public static void main(String[] args) {
        int[] arr = ArrayOfInteger();
        int[] new_arr = NewArrayOfInteger(arr);
        System.out.println("Mean of the new array is: " +meanOfNewArray(new_arr));
    }

    public static int[] ArrayOfInteger() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print("a[ " + i + " ] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] NewArrayOfInteger(int[] arr) {
        System.out.print("Enter b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter c = ");
        int c = new Scanner(System.in).nextInt();
        // create a new array
        int count = 0;
        for (int temp : arr) {
            if ( temp >= b && temp <= c ) {
                count++; // the number of elements in an array
            }
        }
        //elements in a new array
        int[] new_arr = new int[count];
        int i = 0; // index
        for (int temp : arr) {
            if ( temp >=b && temp <= c ) {
                new_arr[i] = temp;
                i++;
            }
        }
        System.out.println("The element(s) in a new array is(are): " + Arrays.toString(new_arr));
        return new_arr;
    }

    public static double meanOfNewArray(int[] new_arr) {
        int sum = 0;
        for (int i = 0; i < new_arr.length; i++) {
            sum += new_arr[i];
        }
        return ((double)sum / new_arr.length);
    }
}
