public class printAllSubsequences {
      
          public static void printAllsubSequences(String s, String result, int index) {
                    if (index == s.length()) {
                              System.out.println(result);
                              return;
                    }
                    //yes- Include the current character
                    printAllsubSequences(s, result + s.charAt(index), index + 1);
                    //no- exclude the current character
                    printAllsubSequences(s, result, index+1);
          }
          public static void main(String[] args) {
                    String s = "ABC";
                    printAllsubSequences(s, "", 0);

          }
}
