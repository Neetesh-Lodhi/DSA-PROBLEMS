class KDistinct{
          
 public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = -1;
        int left = 0;
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                
                left++;
              
                
            }
            if(map.size() == k){
              maxLen = Math.max(maxLen,right-left+1);
            }
        }
        
        return maxLen;
    }



}