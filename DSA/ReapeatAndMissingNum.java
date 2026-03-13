import java.util.ArrayList;
import java.util.HashMap;

public class ReapeatAndMissingNum {
          // User function Template for Java


    // Function to find two elements in array
   public static ArrayList<Integer> findTwoElement(int arr[]) {
              // code here

              int n = arr.length;
              HashMap<Integer, Integer> map = new HashMap<>();
              int repeating = -1, missing = -1;

              //count the frequency of numbers
              for (int num : arr) {
                        map.put(num, map.getOrDefault(num, 0) + 1);
              }

              //find repeat and missing run loop from 1 to <=n

              for (int i = 1; i <= n; i++) {
                        if (!map.containsKey(i)) {
                                  missing = i;

                        } else if (map.get(i) == 2) {
                                  repeating = i;

                        }
              }

              ArrayList<Integer> list = new ArrayList<>();
              list.add(repeating);
              list.add(missing);

              return list;
    }
    
    public static void main(String[] args) {
              int[] arr = { 4, 3, 6, 2, 1, 1 };
              System.out.println(findTwoElement(arr));
    }
}

