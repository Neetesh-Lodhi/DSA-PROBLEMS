import java.util.*;
public class RomanToInteger{
         
                    public static int romanToInt(String s) {
                        Map<Character, Integer> roman = new HashMap<>();
                        roman.put('I', 1);
                        roman.put('V', 5);
                        roman.put('X', 10);
                        roman.put('L', 50);
                        roman.put('C', 100);
                        roman.put('D', 500);
                        roman.put('M', 1000);
                
                        int result = 0;
                        
                        for (int i = 0; i < s.length(); i++) {
                            int currVal = roman.get(s.charAt(i));
                
                            // Check if next character exists and is larger → subtraction case
                            if (i < s.length() - 1 && currVal < roman.get(s.charAt(i + 1))) {
                                result -= currVal;
                            } else {
                                result += currVal;
                            }
                        }
                
                        return result;
                    }

                    public static void main(String[] args) {
                              String str = "MCMXCIV";
                              System.out.println(romanToInt(str));
          }
                }
                
