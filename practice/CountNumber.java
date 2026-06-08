public class CountNumber {
          int maxOr = 0;
          int count = 0;

          public int countMaxOrSubsets(
                              int[] nums) {

                    for (int x : nums)
                              maxOr |= x;

                    dfs(nums, 0, 0);

                    return count;
          }

          private void dfs(
                              int[] nums,
                              int idx,
                              int curOr) {

                    if (idx == nums.length) {

                              if (curOr == maxOr)
                                        count++;

                              return;
                    }

                    dfs(
                                        nums,
                                        idx + 1,
                                        curOr | nums[idx]);

                    dfs(
                                        nums,
                                        idx + 1,
                                        curOr);
          }   
}
