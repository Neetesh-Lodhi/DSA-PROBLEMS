class LengthLongest{
            public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int first = 0;
        int last = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();

     

        while(last < n){
            if(!set.contains(s.charAt(last))){
                set.add(s.charAt(last));
                 maxLen = Math.max(maxLen,set.size());
                 last++;
                }else {
                    set.remove(s.charAt(first));
                     first++;
                }
            }
        
        return maxLen;
    }
}