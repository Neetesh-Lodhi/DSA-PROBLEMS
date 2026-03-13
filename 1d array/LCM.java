
//⏳ Time: O(log(min(a, b)))
// 📦 Space: O(1)



// class Main {
//           public static void main(String[] args) {

//                     int n1 = 20;
//                     int n2 = 15;

//                     int lcm = n1 * n2 / gcd(n1, n2);

//                     System.out.println(lcm);
//           }

//           public static int gcd(int a, int b) {

//                     while (a > 0 && b > 0) {
//                               if (a > b) {
//                                         a = a % b;
//                               } else {
//                                         b = b % a;
//                               }
//                     }

//                     return (a == 0) ? b : a;
//           }
// }


//to find LCM so first you find GCD  of numbers

// public class xyz {
//           public static void LCM(int a, int b) {
//                     int x = a; //Original values remains same
//                     int y = b;
//                     while (a > 0 && b > 0) {
//                               if (a > b) {
//                                         a = a % b;
//                               } else {
//                                         b = b % a;
//                               }
//                     }
//                  int gcd = (a == 0) ? b : a;
//                     int lcm = (x * y) / gcd;
//                     System.out.println(lcm);
//           }
//     public static void main(String[] args) {
//         int a = 16;
//         int b = 24;
//         LCM(a, b);
//     }
// }
