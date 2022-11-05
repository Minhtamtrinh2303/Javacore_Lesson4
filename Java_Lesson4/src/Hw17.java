import java.util.Scanner;

public class Hw17 {
    /**
     * Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
     * (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).
     */
    public static void main(String[] args) {
        //input
        System.out.print("m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //result
        result(m,n);
    }
    //isCoprimeNumber
    public static boolean coprime(int a, int b) {
        for (int i = 2; i<=b; i++){
            if ( b % i == 0 && a % i == 0){
                return false;
            }
        }
        return true;
    }

    //print result
    public static void result(int m, int n) {
        if (coprime(m,n)) {
            System.out.println("They are coprime numbers.");
        } else {
            System.out.println("They are not coprime numbers.");
        }
    }

}
