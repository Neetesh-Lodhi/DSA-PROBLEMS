public class MajorityElement {

          public static int majorityElement(int[] nums){
          int freq = 0;
          int ans = 0;

          for (int i = 0; i < nums.length; i++) {  //TC-O(n)  Sc-O(1)
                    if (freq == 0) {
                              ans = nums[i];
                    }
                    if (ans == nums[i]) {
                              freq++;
                    } else {
                              freq--;
                    }
          }
          return ans;
          }

         public static void main(String[] args) {
                   int[] nums = { 2, 2, 1,1, 1, 2, 2, 1 };
                   System.out.println(majorityElement(nums));
         } 
}
