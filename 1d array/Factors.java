// public class FactorsOfNumber {
//         public static void main(String[] args) {
//                   int n = 9;
//           //         int fact = 0;
//                   for (int i = 1; i <= n; i++) {
//                             if (n % i == 0) {
//                               System.out.print(i + " ");
//                     }
//                   }
//         }  
// }

public class Factors {

    static void Divisor(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal, print only one
                if (n / i == i) {
                    System.out.print(" " + i);
                } else // Otherwise print both
                {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        int n = 14;
        System.out.print("Factors of " + n + " are: ");
        Divisor(n);
    }
}



//optimized approach
// Time Complexity: O(sqrt(N)), we check for every number between 1 and sqrt(N).
// Space Complexity: O(N), constant extra space is used for printing divisors

/*

public static void main(String[] args) {
    int n = 14;

    List<Integer> small = new ArrayList<>();
    List<Integer> large = new ArrayList<>();

    for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            small.add(i);

            if (i != n / i) {   // Avoid duplicates for perfect squares
                large.add(n / i);
            }
        }
    }

    // print smaller factors
    for (int x : small) {
        System.out.print(x + " ");
    }

    // print larger factors in reverse (to maintain sorted order)
    for (int i = large.size() - 1; i >= 0; i--) {
        System.out.print(large.get(i) + " ");
    }
}

*/
