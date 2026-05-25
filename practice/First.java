class First{
          public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each positive number (1 to n) in its correct index position
        // Example: number 1 should be at index 0, 2 at index 1, etc.
        for (int i = 0; i < n; i++) { // T.C = O(n), S.C = O(1)
            int element = nums[i];

            // Keep swapping until the current element is in its correct position
            // Only swap when:
            // 1. element is in the valid range [1, n]
            // 2. element is not already in its correct position
            while (element >= 1 && element <= n && nums[element - 1] != element) {
                swap(nums, i, element - 1); // put element in its right index
                element = nums[i]; // update element after swap for rechecking
            }
        }

        // Step 2: After rearranging, check which index doesn't hold the correct number
        // The first index where nums[i] != i + 1 → that number is missing
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1; // return the smallest missing positive number
        }

        // Step 3: If all numbers are in correct positions,
        // that means array contains all numbers from 1 to n
        // so the missing number is n + 1
        return n + 1;
    }

    // Utility method to swap two elements in array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}