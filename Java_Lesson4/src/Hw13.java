import java.util.Scanner;

public class Hw13 {
    /** Bài 13: Nhập vào 2 số tự nhiên m và n, sao cho m < n.
     * Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?
     */

    public static void main(String[] args) {
        // input
        System.out.print("m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //check m < n ?
        check(m,n);
        //Liệt kê, đếm số chính phương
        System.out.print("Square Number(s) in [m,n] is(are): ");
        count(m,n);
    }

    /*
    Kiểm tra số chính phương
     */
    public static boolean squareNumber(int n) {
        int temp = (int)Math.sqrt(n);
        if ( temp * temp == n) {
            return true;
        }
        return false;
    }

    /*
    Đếm số chính phương
     */
    public static void count (int m, int n) {
        int count = 0; //biến đếm
        for (int i = m; i <= n; i++) {
            if (squareNumber(i)) {
                System.out.print(i +" ; ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("There is(are) " +count+ " square number(s).");
    }

    /*
    check m < n
     */
    public static void check(int m, int n) {
        while (true) {
            if (m >=n) {
                System.out.print("m = ");
                m = new Scanner(System.in).nextInt();
                System.out.print("n = ");
                n = new Scanner(System.in).nextInt();
            }
            break;
        }
    }
}
