public class IsPrime {
          public static boolean IsPrime(int n) {

                    if (n <= 1)
                              return true;

                    for (int i = 2; i * i <= n; i++) {
                              if (n % i == 0) {
                                        return false;
                              }
                    }
                    return true;
          }

          public static void main(String[] args) {
                    int n = 17;

                    System.out.println(IsPrime(n));

          }     
}
