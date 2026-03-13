//kadans algorithm
public class maxSubArraySumKadansAlgo {

      

        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int num : nums) {
                currentSum += num;

                // update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                // reset currentSum if it becomes negative
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }
    
public static void main(String[] args) {   //Explanation: [4,-1,2,1] has the largest sum = 6
          int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
          System.out.println(maxSubArray(arr));
}                
}
