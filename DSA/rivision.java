public class rivision {

  

        public static int maxProdSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {

                   int prod = 1;
                   for (int j = i; j < nums.length; j++) {
                          prod = prod * nums[j];
                          max = Math.max(prod, max);
                   }
            }
            return max;
        }

        public static void main(String[] args) {   //Explanation: [4,-1,2,1] has the largest sum = 6
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println(maxProdSubArray(arr));
        }
    }
       

