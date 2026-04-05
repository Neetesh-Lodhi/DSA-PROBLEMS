class Product{
           public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // this space is NOT counted as extra space - S.C-O(1)

        // prefix calculation
        ans[0] = 1;   // FIXED
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // suffix calculation
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
}