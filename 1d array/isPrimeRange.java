public class isPrimeRange {
          private static void primeRange(int a, int b) {

                    for (int i = a; i < b; i++) {
                              if (isPrime(i)) {
                                        System.out.println(i + " ");
                              }
                    }
          }

          public static boolean isPrime(int n) {

                    if (n <= 1)
                              return false;

                    for (int i = 2; i * i <= n; i++) {
                              if (n % i == 0) {
                                        return false;
                              }
                    }

                    return true;
          }

          public static void main(String[] args) {
                    int a = 5;
                    int b = 15;

                    primeRange(a, b);
          }    
}
