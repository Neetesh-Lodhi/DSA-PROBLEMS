public class SumOfDigit {

          public static int sumOfDigits(int n) {
                  
                    if ( n <= 9) {
                              return n;
                    }
                    return sumOfDigits(n / 10) + n % 10;





                    // int smallAns = sumOfDigits(n / 10);
                    //   return smallAns + n % 10;


                    // int ans = smallAns + n % 10;
                    // return ans;
          }
         
          public static void main(String[] args) {
                   System.out.println(sumOfDigits(1234)) ;
          }
}
