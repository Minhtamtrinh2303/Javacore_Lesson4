import java.util.Scanner;

public class Hw6 {
    /**
     * Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1] và 2 số nguyên b, c (b < c).
     * Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c]
     */
    public static void main(String[] args) {
        int[] arr = array();
        System.out.print("b =  ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("c = ");
        int c = new Scanner(System.in).nextInt();
    }
    public static int[] array() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++ ) {
            System.out.print("a[ " + i + " ] = ");
        }
        return a;
    }
    public static double Sum(int[] arr) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }
        return (double) S / arr.length;
    }
}
