import java.util.Arrays;
import java.util.Scanner;

public class Hw7 {
    /**
     * Nhập mảng a gồm N phần tử bao gồm các số nguyên dương. Kiểm tra xem a có phải là mảng đối xứng hay không
     * (ví dụ: [15 2 1 2 15] là mảng đối xứng).
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        printArrayOfIntegers(arr);
        SymmetricArray(arr);
    }

    private static void printArrayOfIntegers(int[] arr) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] fillArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void SymmetricArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<arr.length - 1; i++) {
            if (arr[i] == arr[n -1 - i] && i == n-1-i) {
                System.out.println("The array is a symmetrical array.");
                return;
            }
        }
        System.out.println("The array is not a symmetrical array.");
    }

}
