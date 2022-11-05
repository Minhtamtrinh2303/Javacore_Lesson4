package question;

public class checkHw18 {
    public static void main(String[] args) {
        for (int i = 100000; i<1000000; i++) {
            if (isReversibleNumber(i) && Sum(i)) {
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

