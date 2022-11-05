public class Hw2 {
    /** Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
     a) Là số nguyên tố.
     b) Tất cả các chữ số là nguyên tố
     c) Đảo của nó cũng là một số nguyên tố
     */
    public static void main(String[] args) {
        for (int i = 1000000; i < 9999999; i++) {
            if (isPrimeNumber(i) && onlyPrime(i) && isReversibleNumber(i)) {
                System.out.println(i);
            }
        }
    }
    /** ý a
     * Là số nguyên tố
     */
    public static boolean isPrimeNumber(int n) {
        if ( n < 2 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
    /** ý b
     * Tất cả các chữ số là nguyên tố => số đó chỉ có thể có các chữ số là 2;3;5;7
     */
    public static boolean onlyPrime(int n) {
        while ( n > 0 ) {
            int digit = n % 10;
            if ( digit == 0 || digit == 1 || digit == 4 || digit == 6 || digit == 8 || digit == 9) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    /** ý c
     *  Đảo của nó cũng là một số nguyên tố => số thuận nghịch
     */
    public static boolean isReversibleNumber(int n) {
        int orginalnumber = n;
        int temp = 0;
        while ( n > 0 ) {
            temp = temp * 10 + n % 10;
            if (orginalnumber == temp) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
