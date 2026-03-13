
public class ReverseString {

    public static String reverse(String s) { //O(n)
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (end > start) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "Hello";

        String reversed = reverse(s);
        for (int i = 0; i < reversed.length(); i++) {
            System.out.println(reversed.charAt(i));
        }
    }
}
