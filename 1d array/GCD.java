
//Brute force - Time Complexity: O(min(N1, N2))
/*
public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        System.out.println(gcd(n1,n2));
    }
    
    public static int gcd(int n1,int n2){
        
        int gcd = 1;
        int min = Math.min(n1,n2);
        for(int i=1;i<=min;i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        
        return gcd;
    }
*/





//t.c - O(log(min(a, b))) time
// public class GCD {

//     // Euclidean Algorithm -The Euclidean algorithm is a method to find the greatest common divisor (GCD) of two integers. It works by repeatedly dividing the larger number by the smaller one and replacing the larger number with the remainder until the remainder becomes zero. The last non-zero remainder is the GCD.
//     public static int GCD(int a, int b) {
//         while (a > 0 && b > 0) {
//             if (a > b) {
//                 a = a % b;
//             } else {
//                 b = b % a;
//             }
//         }
//         // When one of the numbers becomes 0, the other number is the GCD
//         return (a == 0) ? b : a;
//     }

//     public static void main(String[] args) {
//         int a = 52;
//         int b = 10;
//         System.out.println("The GCD of " + a + " and " + b + " is: " + GCD(a, b));
//     }
// }





public class GCD {

    public static int findGcd(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
