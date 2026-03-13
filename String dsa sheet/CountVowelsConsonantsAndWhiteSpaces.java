
public class CountVowelsConsonantsAndWhiteSpaces {

    public static void isSolve(String str, int n) {
        str = str.toLowerCase();
        int vowelCount = 0;
        int whiteSpaceCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                whiteSpaceCount++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') { // Or use Character.isLetter(ch)
                consonantCount++;
            }
        }

        System.out.println("Vowels count is : " + vowelCount);
        System.out.println("Consonant count is : " + consonantCount);
        System.out.println("White spaces count is : " + whiteSpaceCount);
    }

    public static void main(String args[]) {
        String str = "Neetesh lodhi";
        int n = str.length();
        isSolve(str, n);
    }
}      