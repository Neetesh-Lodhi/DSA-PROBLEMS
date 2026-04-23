class Foursum{
          class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>(); //T.C-O(nlgn + n^3)
        int n = nums.length;
        Arrays.sort(nums); // sort for two-pointer logic

        for (int i = 0; i < n - 3; i++) { //because this loop end 3 times before because j,p,q pointer are comes 
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) { //this loop end 2 times before because p and q are already present
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates for j

                int p = j + 1, q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        // skip duplicates for p and q
                        while (p < q && nums[p] == nums[p - 1]) p++;
                        while (p < q && nums[q] == nums[q + 1]) q--;
                    }
                }
            }
        }
        return ans;
    }
}