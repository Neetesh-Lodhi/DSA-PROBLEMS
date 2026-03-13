public class FibonacciSeries {
          
          public static int fibonacci(int n) {
                    //base case
                    if (n == 0 || n == 1) {
                              return n;
                    }
                    //self work
                   return fibonacci(n - 1) + fibonacci(n - 2);

                    //or self work
                      
                    // int prev = fibonacci(n - 1);
                    // int prevPrev = fibonacci(n - 2);
                    // return prev + prevPrev;
          }

          public static void main(String args[]) {
                    int n = 10;
                    for (int i = 0; i <= n; i++) {
                              System.out.println(fibonacci(i)); 
                    }
          }
}
