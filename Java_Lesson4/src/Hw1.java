public class Hw1 {
    /** Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
     * a) Là số thuận nghịch.
     * b) Chỉ có chữ số 0, 6, 8
     * c) Tổng chữ số chia hết cho 10
     */
    public static void main(String[] args) {
        for (int i = 1000000; i<1000000000; i++) {
            if (isReversibleNumber(i) && OnlyEvenNumber(i) && Sum(i)) {
                System.out.println(i);
            }
        }
    }
    //ý a: là số thuận nghịch
    public static boolean isReversibleNumber(int n) {
        int OriginalNumber = n;
        int temp = 0;
        while ( n > 0 ){
            temp = temp * 10 + n % 10;
            if (OriginalNumber == temp) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    /** ý b: Chỉ có chữ số 0,6,8
     * cách làm: giới hạn số đó là số chẵn và không có chữ số 2 và 4.
     */
    public static boolean OnlyEvenNumber(int n) {
        while ( n > 0 ) {
            int digit = n % 10;
            if ( digit % 2 != 0 ) { // các chữ số đều là số chẵn
                return false;
            }
            if (digit == 2 || digit == 4){ // không có chữ số 2 và chữ số 4
                return false;
            }
            n /= 10;
        }
        return true;
    }
    /** ý c: tổng chữ số chia hết cho 10
     * tính tổng các chữ số, kiểm tra xem có chia hết 10 hay không
     */
    public static boolean Sum(int n) {
        int sum = 0;
        while ( n > 0 ) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
}
