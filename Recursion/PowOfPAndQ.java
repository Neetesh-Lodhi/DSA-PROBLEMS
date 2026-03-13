public class PowOfPAndQ {

          public static int pow(int p, int q) {

                    if (q == 0) //curly braces are optional
                              return 1;
                    return pow(p, q - 1) * p;
          }

          public static void main(String[] args) {
                    System.out.println(pow(5, 4));
          }
}



// public class Main {

//     public static int pow(int n, int x) {
//         if (x == 0) {
//             return 1; // Base case: anything^0 = 1
//         }
//         int half = pow(n, x / 2); // Recursively compute half power

//         if (x % 2 == 0) {
//             return half * half; // If x is even
//          }else {
//             return n * half * half; // If x is odd

//             }}

//     public static void main(String[] args) {
//         System.out.println(pow(2, 4)); // Output: 16
//         System.out.println(pow(3, 5)); // Output: 243
//     }
// }
