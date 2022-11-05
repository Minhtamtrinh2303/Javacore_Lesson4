import java.util.Arrays;
import java.util.Scanner;

public class Hw5 {
    /**
     * Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1]. Tìm số lớn thứ hai và vị trí của nó trong dãy.
     * Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
     */
    public static void main(String[] args) {
        int[] arr = array();
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        findTheNumber(arr);
    }
    public static int[] array() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void findTheNumber(int[] arr){
        int max = arr[0];
        int result = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if ( arr[i] != arr[i+1]) { //
                result = arr[i+1];
                System.out.println("Vị trí của số thứ hai là: " +(i+1));
                System.out.println("Số lớn thứ hai là: " +result);
                break;//
            }
        }
        if ( result == max ) {
            System.out.println("Không có số lớn thứ 2");
        }
    }
    // sắp xếp các số theo thứ tự giảm dần
    public static void sorting(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ( arr[j] > arr[j-1] ) {
                    int result = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = result;
                }
            }
        }
    }
}
