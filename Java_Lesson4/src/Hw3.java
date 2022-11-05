import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    /**
     * Nhập số n và dãy các số nguyên a[0], a[1],…, a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.
     */
    public static void main(String[] args) {
        int[] arr = array();
        System.out.println("Dãy số nguyên ban đầu là: " +Arrays.toString(arr));
        System.out.println("Dãy số nguyên sắp xếp theo thứ tự tăng dần là: " +Arrays.toString(bubblesort(arr)));
    }

    public static int[] array() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            System.out.print("a["+ i +"] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] bubblesort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if ( a[i] > a[j] ) {
                    int result = a[i];
                    a[i] = a[j];
                    a[j] = result;
                }
            }
        }
        return a;
    }
}
