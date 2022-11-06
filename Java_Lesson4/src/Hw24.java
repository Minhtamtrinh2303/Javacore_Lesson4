import java.util.Arrays;
import java.util.Scanner;

public class Hw24 {
    /**
     * Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). Thực hiện sắp xếp mảng theo thứ tự giảm dần.
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        System.out.println(Arrays.toString(sortingNewArray(arr)));
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

    public static int[] sortingNewArray(int[] arr) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]) {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
        return arr;
    }

}
