
// public class Main {  //very inefficient -  (O(2^n))

//     public static void main(String[] args) {
//         int num = 6;
//         for (int i = 0; i < num; i++) {
//             System.out.print(fib(i) + " ");
//         }
//     }

//     public static int fib(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }
// }

public class PrintFibbonacciToNthTerm {

     public static void main(String[] args) {
          int n = 5;
          int a = 0;
          int b = 1;

          for (int i = 0; i < n; i++) {
               System.out.println(a + " ");
               int curr = a + b;
               b = a;
               a = curr;
          }
     }
}