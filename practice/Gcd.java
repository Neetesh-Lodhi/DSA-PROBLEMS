class Gcd {
           public int GCD(int n1, int n2) {
          int gcd = 0;

          for(int i=1;i<Math.min(n1,n2);i++){
               if(n1 % i == 0 && n2 % i == 0){
                   gcd = i;
               }
          }

          return gcd;
    }
}