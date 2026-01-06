public class AbudantNumOrNot {

          //brute force
          public static void abudantNum(int n) {
                    int temp = n;
                    int sum = 0;
                    
                    for (int i = 1; i < n; i++) {
                              if (n % i == 0) {
                                        sum += i;
                              }
                    }
                              if (sum > temp) {
                                        System.out.println("Abudant");
                              } else {
                                        System.out.println(" not Abudant");
                              }
                    
          }
          
          public static void main(String[] args) {
                    int n = 36;
                    abudantNum(n);
          }
}




/*
//abundant number

class Main {
    public static void main(String[] args) {
        int n = 18;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {

                // add divisor i
                if (i != n) sum += i;

                int other = n / i;

                // add divisor n/i (only if it is different & not equal to n)
                if (other != i && other != n) {
                    sum += other;
                }
            }
        }

        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not Abundant Number");
        }
    }
}



*/