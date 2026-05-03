import java.util.HashMap;
import java.util.Stack;

public class ValidPare {
     public boolean isValid(String s) {  //T.C-O(n)  S.C-O(n)
    
    // Step 1️ Create a map of closing → opening brackets
    HashMap<Character, Character> mappedBrackets = new HashMap<>();
    mappedBrackets.put(')', '(');
    mappedBrackets.put('}', '{');
    mappedBrackets.put(']', '[');

    // Step 2️ Create a stack to store opening brackets
    Stack<Character> stack = new Stack<>();

    // Step 3️ Traverse each character in the string
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        // Case A: It's an opening bracket
        if (!mappedBrackets.containsKey(ch)) {
            stack.push(ch); // push into stack
        } 
        // Case B: It's a closing bracket
        else {
            // If no opening bracket to match → invalid
            if (stack.isEmpty()) {
                return false;
            }

            // Pop the last opened bracket
            char toppedElement = stack.pop();

            // Check if it matches the corresponding opening bracket
            if (toppedElement != mappedBrackets.get(ch)) {
                return false;
            }
        }
    }

    // Step 4️ If stack is empty → all brackets matched
    return stack.isEmpty();   
}     
}
