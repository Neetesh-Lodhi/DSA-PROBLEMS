class RemoveElement{
           public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            if(nums[i] == val){
                continue;
            }else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}