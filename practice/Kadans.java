public record Kadans() {
          public int maxSubArray(int[] nums) {
                    int maxSum = Integer.MIN_VALUE; // 0(n)
                    int currentSum = 0;

                    for (int num : nums) {
                              currentSum += num;

                              if (currentSum > maxSum) {
                                        maxSum = currentSum;
                              }
                              if (currentSum < 0) {
                                        currentSum = 0;
                              }
                    }
                    return maxSum;
          }
       
}
