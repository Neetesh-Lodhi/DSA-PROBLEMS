class SString{
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
}