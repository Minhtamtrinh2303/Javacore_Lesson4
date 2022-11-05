package question;

import java.util.Scanner;
//nhập n sao cho n chỉ có chữ số chẵn
public class evennumber {
    public static void main(String[] args) {
        for (int i = 100; i<1000; i++) {
            if (OnlyEvenNumber(i) && NotFour(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean OnlyEvenNumber(int n){
        while (n > 0) {
            int digit = n % 10;
            if ( digit % 2 == 0 ) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    public static boolean NotFour(int n){
        while (n>0) {
            int digit = n % 10;
            if ( digit == 4 || digit == 2) {
                return false;
            }
            n /= 10;
        }
        return true;//thắc mắc vì sao viết thế này ko được
    }
}
/** số đó chỉ có chữ số 0,6,8
 *     public static boolean ContainNumber(int n) {
 *         while (n>0) {
 *             int digit = n % 10;
 *             if (digit == 0 || digit == 6 || digit == 8){
 *                 return true;
 *             }
 *             n /= 10;
 *         }
 *         return false;
 *     }
 */