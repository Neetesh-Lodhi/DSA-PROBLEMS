import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
           public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
          int n = arr.length;
           Stack<Integer> stack = new Stack<>();
           ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
           
           
           
           for(int i=n-1;i>=0;i--){
               while(stack.size() > 0 && stack.peek() <= arr[i] ){
                   stack.pop();
               }
                if(stack.isEmpty()){
                    ans.set(i,-1);
                } else
           {
                    ans.set(i,stack.peek());
           }
           
           stack.push(arr[i]);
    }
    
    return ans;
    } 
}
