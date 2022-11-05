public class Hw18 {
    /**
     * Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).
     */
    public static void main(String[] args) {
        for ( int i = 100000; i<1000000; i++) {
            if (sum(i) && isReversibleNumber(i)) {
                System.out.println(i);
            }
        }
    }
    //tổng chữ số chia hết cho 10
    public static boolean sum(int n) {
        int sum = 0;
        while ( n > 0 ) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
    //kiểm tra số thuân nghịch
    public static boolean isReversibleNumber(int n) {
        int orginalNumber = n;
        int temp = 0;
        while ( n > 0 ) {
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        if ( orginalNumber == temp ) {
            return true;
        }
        return false;
    }
}
