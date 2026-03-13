//O(d) × O(1) = O(d)

//⏳ Time Complexity: O(log₁₀(n)) → O(digits)

//(Practically: Very small because digits are limited)

public class StrongNumber {
          public static void main(String[] args) {
                    int n = 145;
                    int temp = n;
                    int fact = 0;
                    while (n > 0) {
                              int ld = n % 10;
                              fact = fact + calculateFact(ld);
                              n = n / 10;
                    }

                    if (fact == temp) {
                              System.out.println("Yes");
                    } else {
                              System.out.println("No");
                    }

          }

          // So factorial computation takes O(9) → O(1) time (constant).
          public static int calculateFact(int n) {
                    int fact = 1;

                    for (int i = 1; i <= n; i++) {
                              fact = fact * i;
                    }

                    return fact;
          }     
}
