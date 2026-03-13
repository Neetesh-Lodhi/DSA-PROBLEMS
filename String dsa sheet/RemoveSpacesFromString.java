
public class RemoveSpacesFromString {

          // Method to remove spaces using StringBuilder
          public static String removeSpaces(String str) {
                    StringBuilder result = new StringBuilder(str.length());

                    for (int i = 0; i < str.length(); i++) {
                              char ch = str.charAt(i);
                              if (ch != ' ') {
                                        result.append(ch);
                              }
                    }

                    return result.toString();
          }

          // Main method
          public static void main(String[] args) {
                    String str = "neetesh lodhi semester six";
                    String noSpaceStr = removeSpaces(str);
                    System.out.println("Original String: " + str);
                    System.out.println("After Removing Spaces: " + noSpaceStr);
          }
}

/*public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "neetesh lodhi semester six";
        System.out.println(str.replaceAll(" ", ""));
    }
}
 */
