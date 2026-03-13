// public class APseriesSum {

//     public static int APseriesSum(float a,float n,float d) {
//               int sum = 0;
//               for (int i = 1; i <= n; i++) {
//                         sum += a;
//                         a += d;
//               }
//               return sum;
// }
// public static void main(String args[]) {
//     float a = 2, n = 4, d = 2;
//     System.out.println(APseriesSum(a, n, d));
// }
// }
//sum of nth term of AP'S -  Sn = n/2[2a + (n − 1) × d]
//nth term of an AP-  an = a + (n − 1) × d

public class APseriesSum {

          public static void APseriesSum(float a, float n, float d) {

                  double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
                  System.out.println(sum);
    }

public static void main(String args[]) {
          float a = 2, n = 4, d = 2;
          APseriesSum(a, n, d);
    }
}

































// public class APseriesSum {

//           public static int APseriesSum(float a,float n,float d) {
              
//                     int sum = 0;
//                     for (int i = 1; i <= n; i++) {

//                               sum += a;
//                               a += d;
//                     }
//                     return sum;
                  
//     }

// public static void main(String args[]) {
//           float a = 2, n = 4, d = 2;
//           System.out.println(APseriesSum(a, n, d));
//     }
// }