class RepAndMis{
           ArrayList<Integer> findTwoElement(int nums[]) {
        // code here
      int n = nums.length;
      HashMap<Integer,Boolean> map = new HashMap<>();
      ArrayList<Integer> ans = new ArrayList<>();
      int repeat = -1;
      int missing = -1;
      for(int i=0;i<n;i++){
          if(map.get(nums[i]) == null){
              map.put(nums[i],true);
          }else {
              repeat = nums[i];
              ans.add(repeat);
          }
      }
      
      for(int i=1;i<=n;i++){
          if(map.get(i) == null){
              missing = i;
              ans.add(missing);
              break;
              
          }
      }
      return ans;
    }
}