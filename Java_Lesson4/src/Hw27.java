import java.util.Arrays;
import java.util.Scanner;

public class Hw27 {
    /**
     //Thực hiện nhập vào hai mảng số nguyên a, b đều có n phần tử (n>0).
     //Thực hiện tính tổng hai mảng này theo quy tắc:
     * phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
     * tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2 của mảng kết quả, …
     */
    public static void main(String[] args) {
        System.out.println("Enter array A");
        int[] array_A = arr();
        System.out.println("Enter array B"); //array B has the same elements like array A
        int[] array_B = new int[array_A.length];
        arrElements(array_B);
        int[] array_cal = cal_array(array_A, array_B);
        System.out.println("The new array is: "+ Arrays.toString(array_cal));
    }

    public static int[] arr() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        arrElements(arr);
        return arr;
    }

    public static void arrElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
    }

    public static int[] cal_array(int[] array_A, int[] array_B) {
        int[] array_cal = new int[array_A.length];
        for(int i = 0; i < array_cal.length ; i++) {
            array_cal[i] = array_A[i] + array_B[array_B.length - 1 - i];
        }
        return array_cal;
    }

}
