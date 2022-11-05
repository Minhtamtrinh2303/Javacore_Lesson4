import java.util.Arrays;
import java.util.Scanner;

public class Hw10 {
    /**
     * Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau. Nếu nhập một số đã có
     * thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
     */
    public static void main(String[] args) {
        int[] arr = ArrayOfIntegers();
        printArrayOfIntegers(arr);
    }

    public static int[] ArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        InputAgain(arr);
        return arr;
    }

    public static void printArrayOfIntegers(int[] arr) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void InputAgain(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println("Invalid value");
                    System.out.print("arr[" + i + "] = ");
                    arr[i] = new Scanner(System.in).nextInt();
                    j = 0;
                }
            }
        }
    }

}
