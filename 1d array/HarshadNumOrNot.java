public class HarshadNumOrNot {
    public static void main(String args[]) {
        int n = 378;
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (n % sum == 0) {
            System.out.println("YES it is Harshad Number");
        } else {
            System.out.println("NO it is Harshad Number");
        }

    }
}
    
/*

public static void main(String[] args) {
        int n = 78;
        harshad(n);
    }
    
    public static void harshad(int n){
        int temp = n;
        int sum =0;
        
        while(n != 0){
            int ld = n % 10;
            sum = sum+ ld;
            n = n/10;
        }
        
        if(temp % sum == 0){
            System.out.println("Harshad number");
        }else {
            System.out.println("Not Harshad number");
        }
    }
*/

