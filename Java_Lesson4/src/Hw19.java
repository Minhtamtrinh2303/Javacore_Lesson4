import java.util.Arrays;
import java.util.Scanner;

public class Hw19 {
    /**
     * Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0). Tìm số lớn nhất và nhỏ nhất trong mảng a.
     */
    public static void main(String[] args) {
        //nhập mảng
        int[] arr = array();
        System.out.println(Arrays.toString(arr));
        //in ra max, min
        System.out.println("Max = " +Max(arr));
        System.out.println("Min = " +Min(arr));
    }

    //nhập mảng
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

    //find max
    public static int Max(int[] arr) {
        int max = arr[0];
        for ( int i = 1; i < arr.length; i++) {
            if ( max < arr[i] ) {
                max = arr[i];
            }
        }
        return max;
    }

    //find min
    public static int Min(int[] arr) {
        int min = arr[0];
        for ( int i = 1; i < arr.length; i++) {
            if ( min > arr[i] ) {
                min = arr[i];
            }
        }
        return min;
    }

}
