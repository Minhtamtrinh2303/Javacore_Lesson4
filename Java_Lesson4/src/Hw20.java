import java.util.Arrays;
import java.util.Scanner;

public class Hw20 {
    /**
     * Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0) và một giá trị thực x.
     * Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a sao cho vẫn giữ được tính sắp xếp của mảng.
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        //Before
        System.out.println("The element(s) is(are): ");
        System.out.print("Before: ");
        System.out.println(Arrays.toString(sortingNewArray(arr)));
        //After
        NewArrayOfIntegers(arr);
    }

    public static int[] fillArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void NewArrayOfIntegers(int[] arr) {
        System.out.print("Enter x = ");
        int x = new Scanner(System.in).nextInt();
        int[] new_arr = new int[arr.length + 1]; // create a new array
        for (int i = 0; i < arr.length ; i++) { // copy elements in an array => new array
            new_arr[i] = arr[i];
        }
        new_arr[new_arr.length - 1] = x;
        System.out.println("The element(s) is(are): ");
        System.out.print("After: ");
        System.out.println(Arrays.toString(sortingNewArray(new_arr)));
    }

    public static int[] sortingNewArray(int[] array) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    swapped = true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

}
