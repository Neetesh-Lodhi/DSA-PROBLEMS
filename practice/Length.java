class Length {
    public int lengthOfLongestSubstring(String s) {
     
       HashSet<Character> set = new HashSet<>();
       int maxlen = 0;
       int start = 0;
       int end = 0;

       while(end < s.length()){
          if(!set.contains(s.charAt(end))){
            set.add(s.charAt(end));
            maxlen = Math.max(maxlen,set.size());
            end++;
       }else {
           set.remove(s.charAt(start));
           start++;
       }
       }
       return maxlen;
    }
}