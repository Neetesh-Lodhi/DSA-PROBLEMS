public class Pow {
          public static void main(String[] args) {
                    int x = 2;
                    int n = 5;

                    int ans = 1;

                    for (int i = 0; i < n; i++) {
                              ans = ans * x;
                    }

                    System.out.println(ans + " ");

                    // System.out.println(Math.pow(2,5));
          }
}


// :O(log(N))where N is the exponent. This is because the algorithm repeatedly
// halves the exponent at each step, leading to a logarithmic number of
// iterations

//optimized approach binary exponentian
/*
class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = 1;
        int oriNum = n;
        
         // If 'n' is negative, make 'x' its reciprocal and change 'n' to its absolute value minus 1
         
         if(n < 0){
             x = x/2;
             n = -(n+1);
             ans = ans*x;
         }
        
        
        
        // If the base is 0 or 1, return the base itself
        if(x == 0 || x == 1){
            System.out.println(x);
        }
        
          // Loop to compute the result iteratively
        while(n > 0){
            
     // If 'n' is odd, multiply 'ans' by 'x' and decrement 'n' by 1
            if(n % 2 == 1){
                ans = ans*x;
                n = n-1;
            }else {
                n = n/2;
                x = x*x;
            }
        }
        
        System.out.println(ans);
    }
}
*/
