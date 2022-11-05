import java.util.Arrays;
import java.util.Scanner;

public class Hw4 {
    /**
     * Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
     * Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên (tức là đếm số cặp a[i] , a[i+1] sao cho a[i] = a[i+1];
     * nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).
     */
    public static void main(String[] args) {
        int[] arr = array();
        System.out.println("Số cặp 2 phần từ liên tiếp bằng nhau trong dãy "+ Arrays.toString(arr)+" là "+sorting(arr));
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
    public static int sorting(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i+1]){
                count++;
            }
        }
        return count;
    }
}
