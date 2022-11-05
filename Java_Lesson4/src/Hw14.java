import java.util.Scanner;

public class Hw14 {
    /** Nhập số tự nhiên n rồi tính tổng
     * S = 1 + 1/2 + 1/3 + ... + 1/n
     */
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt(); //Natural Number
        System.out.println("Sum = "+Sum(n));
    }
    public static double Sum(int n) {
        double S = 0;
        for (double i = 1; i <= n; i++) {
            S += 1/i;
        }
        return S;
    }
}
