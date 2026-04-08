class ThreeSum{
            public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //O(1) - output list not counted

        int n = nums.length;

        Arrays.sort(nums); //O(nlogn)

        for(int i=0;i<n-2;i++){ //O(n2) - so final time complexity - O(n^2) because it dominates in comparison of O(nlogn)
            if(i>0 && nums[i] == nums[i-1])continue;
            int p = i+1;
            int q = n-1;

            while(p<q){
                long sum = (long) nums[i] + nums[p] + nums[q];

                if(sum < 0){
                     p++;
                }else if (sum > 0){
                    q--;
                }else {
                    ans.add(Arrays.asList(nums[i],nums[p],nums[q]));
                    p++;
                    q--;

                     
                    while (p < q && nums[p] == nums[p - 1]) p++;
                    while (p < q && nums[q] == nums[q + 1]) q--;
                }

                
            }
        }

        return ans;
    }
}