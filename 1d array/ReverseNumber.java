public class ReverseNumber {

          public static int revNumber(int n) {
                    int revNum = 0;
                    while (n > 0) {
                              int lastDigit = n % 10;
                              revNum = (revNum * 10) + lastDigit;
                              n = n / 10;
                    }
                    return revNum;
          }
      public static void main(String[] args) {
                int n = 12345;
                System.out.printl();
            }    
}
