
public class RemoveAllVowels {

    public static void removeVowels(String s, int n) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            result.append(ch);
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String str = "Neetesh";
        int n = str.length();
        removeVowels(str, n);
    }
}         
