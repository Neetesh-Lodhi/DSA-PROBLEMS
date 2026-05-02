class Valid {
            public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Step 1: fill leftMax
        leftMax[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], nums[i]);
        }

        // Step 2: fill rightMax
        rightMax[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], nums[i]);
        }

        // Step 3: check condition
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n-1){
                ans.add(nums[i]); // always valid
            }
            else if(nums[i] > leftMax[i-1] || nums[i] > rightMax[i+1]){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}