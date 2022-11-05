import java.util.Scanner;

public class Hw15 {
    // Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt(); //Natural Number
        System.out.println("Sum = " +sum(n));
    }
    public static int sum(int n) {
        int S = 0;
        for (int i = 0; i <=n; i++) {
            if ( i % 7 == 0) {
                S += i;
            }
        }
        return S;
    }
}
