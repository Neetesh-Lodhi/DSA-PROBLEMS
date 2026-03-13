public class PalindromeOrNot {
         
          public static int palindrome(int n,int sum) {
                    if (n == 0) {
                              return sum;
                    }
                    sum = (sum * 10) + (n % 10);
                    return palindrome(n / 10, sum);
          }
          public static void main(String[] args) {
                    int n = 121;
                    int sum = 0;
                    int p;
                    p = palindrome(n, sum);
                    if (p == n) {
                              System.out.println("Number is Palindrome");
                    } else {
                              System.out.println("Number is not palindrome");
                     }
          }
}


// public class Main  - two-pointer approach
// {
//     public static boolean isPalindrome(String s,int left,int right){
//         if(left>=right){
//             return true;
//         }
        
//         if(s.charAt(left)!=s.charAt(right)){
//             return false;
//         }
//         return isPalindrome(s,left+1,right-1);
//     }
// 	public static void main(String[] args) {
// 		String s = "madam";
// 		if(isPalindrome(s,0,s.length()-1)){
// 		    System.out.println("palindrome");
// 		} else {
// 		    System.out.println("not palindrome");
// 		}
// 	}
// }
