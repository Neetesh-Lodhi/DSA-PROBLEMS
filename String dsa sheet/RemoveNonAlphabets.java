
public class RemoveNonAlphabets {

    public static String keepOnlyAlphabets(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // manually check for alphabet
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "N33ee!!t#e$sh@ 2025*";
        String cleaned = keepOnlyAlphabets(str);
        System.out.println("After removing non-alphabets: " + cleaned);
    }
}

/*
public class RemoveNonAlphabets {

    public static String keepOnlyAlphabets(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) { // only A-Z, a-z are allowed
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "N33ee!!t#e$sh@ 2025*";
        String cleaned = keepOnlyAlphabets(str);
        System.out.println("After removing non-alphabets: " + cleaned);
    }
}      
 */
