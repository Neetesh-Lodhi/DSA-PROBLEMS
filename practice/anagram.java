class anagram {
          

          public static boolean isAnagram(String s1, String s2) {
                    if (s1.length() != s2.length()) {
                              return false;
                    }

                    int[] count = new int[26];

                    for (int i = 0; i < s1.length(); i++) {
                              count[s1.charAt(i) - 'a']++;
                    }

                    for (int i = 0; i < s2.length(); i++) {
                              count[s2.charAt(i) - 'a']++;
                    }

                    for (int i = 0; i < count.length; i++) {
                              if (count[i] != 0) {
                                        return false;
                              }
                    }

                    return true;
          }
          public static void main(String[] args) {
                    String s1 = "listen";
                    String s2 = "silent";
                    System.out.println(isAnagram(s1,s2));
          }
}