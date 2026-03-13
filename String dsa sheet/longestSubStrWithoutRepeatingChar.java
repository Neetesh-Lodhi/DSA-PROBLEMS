


import java.util.*;

public class longestSubStrWithoutRepeatingChar {
        
          
          public static void main(String[] args) {
                    String s = "abcdabcbb";
                    int start = 0;
                    int end = 0;
                    int max_length = 0;

                    List<Character> list = new ArrayList<Character>();

            while(end<s.length()){
                      if (!list.contains(s.charAt(end))) {
                                list.add(s.charAt(end));
                                end++;
                                max_length = Math.max(max_length, list.size());
                      } else {
                                list.remove(Character.valueOf(s.charAt(start)));   //conversion to int
                                start++;
                    }
            }
            System.out.println("max length is "+ max_length);

          }
}
