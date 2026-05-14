import java.util.Stack;

public class SumOfSubarr {
          public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
       
       int[] nse = findNse(arr);
       int[] psee = findPsee(arr);
       long total = 0;
       int mod = (int) 1e9 + 7;

       for(int i=0;i<n;i++){
           long left = i - psee[i];
           long right = nse[i] - i;

           long contribution = (right*left % mod) * arr[i] % mod;
           total = (total + contribution) % mod;
       }
       return (int) total;
    }


public int[] findNse(int[] arr){
    int n = arr.length;
    int[] nse = new int[n];

    Stack<Integer> stack = new Stack<>();

   for(int i=n-1;i>=0;i--){
    while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
           stack.pop();
    }

    nse[i] = stack.isEmpty() ? n : stack.peek();
    stack.push(i);
   }
   return nse;
}


public int[] findPsee(int[] arr){
    int n = arr.length;
    int[] psee = new int[n];

    Stack<Integer> stack = new Stack<>();

    for(int i=0;i<n;i++){
        while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
            stack.pop();
        }

    psee[i] = stack.isEmpty() ? -1 : stack.peek();
    stack.push(i);
    }
   
   return psee;
    
} 
}
