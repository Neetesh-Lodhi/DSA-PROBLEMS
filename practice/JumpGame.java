class jumpGame{
            public boolean canJump(int[] nums) {

     //Greedy Approach   
      int maxReach = 0;
      for(int i=0;i<nums.length;i++){
         if(i > maxReach) return false;
         maxReach = Math.max(maxReach,i+nums[i]);
      }

      return true;

    }
}