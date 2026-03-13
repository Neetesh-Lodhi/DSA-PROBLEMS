// public class TwentyRivision {

// }

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 1, 2, 4, 5 };
//                     int n = arr.length + 1;
//                     int sum = 0;
//                     for (int i = 1; i <= n; i++) {
//                               sum += i;
//                     }

//                     for (int i = 0; i < arr.length; i++) {
//                               sum -= arr[i];
//                     }

//                     System.out.println(sum);
//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 6, 8, 2, 4, 5 };
//                     int first = Integer.MIN_VALUE;
//                     int second = Integer.MIN_VALUE;

//                     for (int i = 0; i < arr.length; i++) {
//                               if (arr[i] > first) {
//                                         second = first;
//                                         first = arr[i];

//                               } else if (arr[i] < first && arr[i] > second) {
//                                         second = arr[i];
//                               }
//                     }

//                     System.out.println(second);

//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 1, 2, 3, 4 };

//                     reverse(arr);
//                     for (int x : arr) {
//                               System.out.print(x + " ");
//                     }
//                     System.out.println();
//           }

//           public static void reverse(int[] arr) {
//                     int start = 0;
//                     int end = arr.length - 1;

//                     while (start < end) {
//                               int temp = arr[start];
//                               arr[start] = arr[end];
//                               arr[end] = temp;
//                               start++;
//                               end--;
//                     }
//           }
// }

// import java.util.*;

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 1, 1, 2, 3, 3 };
//                     int uniqueCount = duplicate(arr);

//                     for (int i = 0; i < uniqueCount; i++) {
//                               System.out.println(arr[i] + " ");
//                     }

//           }

//           public static int duplicate(int[] arr) {
//                     int n = arr.length;
//                     int count = 0;

//                     for (int i = 0; i < n; i++) {
//                               if (i < n - 1 && arr[i] == arr[i + 1]) {
//                                         continue;
//                               } else {
//                                         arr[count] = arr[i];
//                                         count++;
//                               }
//                     }
//                     return count;
//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 1, 2, 3, 4, 5 };
//                     int k = 1;
//                     rightRotate(arr, k);
//                     for (int x : arr) {
//                               System.out.print(x + " ");
//                     }
//           }

//           public static void rightRotate(int[] arr, int k) {
//                     int n = arr.length;
//                     if (k > n) {
//                               k = k % n;
//                     }

//                     reverse(arr, 0, n - 1);
//                     reverse(arr, 0, k - 1);
//                     reverse(arr, k, n - 1);
//           }

//           public static void reverse(int[] arr, int start, int end) {

//                     while (start < end) {
//                               int temp = arr[start];
//                               arr[start] = arr[end];
//                               arr[end] = temp;
//                               start++;
//                               end--;
//                     }
//           }
// }

// class Main {
//           public static void main(String[] args) {

//                     String s = "abcd";

//                     String reversed = new StringBuilder(s).reverse().toString();
//                     System.out.println(reversed);

//           }
// }

// class Main {
//           public static void main(String[] args) {

//                     char[] arr = { 'a', 'b', 'c', 'd' };

//                     int start = 0;
//                     int end = arr.length - 1;

//                     while (start < end) {
//                               char temp = arr[start];
//                               arr[start] = arr[end];
//                               arr[end] = temp;
//                               start++;
//                               end--;
//                     }

//                     System.out.println(arr);
//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     String str = "sir";
//                     int n = str.length();
//                     str = str.toLowerCase();
//                     boolean isPalindrome = true;
//                     int start = 0;
//                     int end = n - 1;

//                     while (start < end) {
//                               if (str.charAt(start) != str.charAt(end)) {
//                                         isPalindrome = false;
//                                         break;
//                               }
//                               start++;
//                               end--;

//                     }

//                     System.out.println(isPalindrome);
//           }
// }

// import java.util.*;

// class Main {
//           public static void main(String[] args) {
//                     String s = "aabbcdfgg";

//                     LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

//                     for (int i = 0; i < s.length(); i++) {
//                               char ch = s.charAt(i);
//                               map.put(ch, map.getOrDefault(ch, 0) + 1);
//                     }

//                     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                               if (entry.getValue() == 1) {
//                                         System.out.println(entry.getKey());
//                                         return;
//                               }
//                     }
//                     System.out.println("-1");
//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     String s = "aabcdf";
//                     int[] freq = new int[256];

//                     for (int i = 0; i < s.length(); i++) {
//                               char ch = s.charAt(i);
//                               freq[ch]++;
//                     }

//                     for (int i = 0; i < s.length(); i++) {
//                               char ch = s.charAt(i);
//                               if (freq[ch] == 1) {
//                                         System.out.println(ch);
//                                         return;
//                               }
//                     }

//                     System.out.println("-1");
//           }
// }

// import java.util.*;

// class Main {
//           public static void main(String[] args) {
//                     String s = "aabbccdf";

//                     HashMap<Character, Integer> map = new HashMap<>();

//                     for (int i = 0; i < s.length(); i++) {
//                               char ch = s.charAt(i);

//                               map.put(ch, map.getOrDefault(ch, 0) + 1);
//                     }

//                     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                               System.out.println(entry.getKey() + " - " + entry.getValue());
//                     }
//           }
// }

// class Main {
//           public static void main(String[] args) {
//                     String s1 = "listen";
//                     String s2 = "silent";

//                     System.out.println(isAnagram(s1, s2));

//           }

//           public static boolean isAnagram(String s1, String s2) {
//                     if (s1.length() != s2.length()) {
//                               return false;
//                     }

//                     int[] count = new int[26];

//                     for (int i = 0; i < s1.length(); i++) {
//                               count[s1.charAt(i) - 'a']++;
//                     }

//                     for (int i = 0; i < s2.length(); i++) {
//                               count[s2.charAt(i) - 'a']--;
//                     }

//                     for (int i = 0; i < count.length; i++) {
//                               if (count[i] != 0) {
//                                         return false;
//                               }
//                     }
//                     return true;
//           }
// }

// import java.util.*;

// class Main {
//           public static void main(String[] args) {
//                     int[] arr = { 1, 2, 2, 2, 3 };

//                     HashMap<Integer, Integer> map = new HashMap<>();

//                     for (int i = 0; i < arr.length; i++) {
//                               map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//                     }

//                     int maxFreq = 0;
//                     int result = -1;
//                     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

//                               if (entry.getValue() > maxFreq) {
//                                         maxFreq = entry.getValue();
//                                         result = entry.getKey();
//                               }

//                     }

//                     System.out.println(result);
//           }
// }

// import java.util.*;

// class Main {
//           public static void main(String[] args) {

//                     int[] arr = { 1, 5, 3, 7, 9 };
//                     int TargetSum = 10;
//                     pairSum(arr, TargetSum);

//           }

//           public static void pairSum(int[] arr, int target) {

//                     HashSet<Integer> set = new HashSet<>();

//                     for (int x : arr) {
//                               int compilement = target - x;

//                               if (set.contains(compilement)) {
//                                         System.out.println("pair found : " + compilement + "," + x);
//                                         // return;
//                               }
//                               set.add(x);
//                     }

//                     // System.out.println("No Pair Found");
//           }
// }

// class Main {

//           static class ListNode {
//                     int val;
//                     ListNode next;

//                     ListNode(int val) {
//                               this.val = val;
//                               this.next = null;
//                     }

//           }

//           public static ListNode reverse(ListNode head) {
//                     ListNode curr = head;
//                     ListNode prev = null;

//                     while (curr != null) {
//                               ListNode temp = curr.next;
//                               curr.next = prev;
//                               prev = curr;
//                               curr = temp;
//                     }
//                     return prev;
//           }

//           public static void main(String[] args) {
//                     ListNode head = new ListNode(1);
//                     head.next = new ListNode(2);
//                     head.next.next = new ListNode(3);
//                     head.next.next.next = new ListNode(4);

//                     head = reverse(head);

//                     while (head != null) {
//                               System.out.print(head.val + " ");
//                               head = head.next;
//                     }

//           }
// }

// class Main {

//           static class ListNode {
//                     int val;
//                     ListNode next;

//                     ListNode(int val) {
//                               this.val = val;
//                               this.next = null;
//                     }

//           }

//           public static boolean isCycle(ListNode head) {

//                     ListNode slow = head;
//                     ListNode fast = head;

//                     while (fast != null && fast.next != null) {
//                               slow = slow.next;
//                               fast = fast.next.next;

//                               if (slow == fast) {
//                                         return true;
//                               }

//                     }

//                     return false;
//           }

//           public static void main(String[] args) {
//                     ListNode head = new ListNode(1);
//                     head.next = new ListNode(2);
//                     head.next.next = new ListNode(3);
//                     head.next.next.next = head;

//                     System.out.println(isCycle(head));
//           }
// }

// import java.util.*;

// class Main {

//           public static void main(String[] args) {
//                     String s = "()(){}";
//                     System.out.println(check(s));

//           }

//     public static boolean check(String s) {
       
//         HashMap<Character,Character> mappedBrackets = new HashMap<>();
//         mappedBrackets.put(')','(');
//         mappedBrackets.put('}','{');
//         mappedBrackets.put(']','[');
        
//         Stack<Character> stack = new Stack<>();
        
//        for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
            
//             if(!mappedBrackets.containsKey(ch)){
//                  stack.push(ch);
//             }
//             else{
            
//             if (stack.isEmpty()){
//                 return false;
//             }
            
//             } 
            
            
//             char toppedElement = stack.pop();
            
//             if(toppedElement != mappedBrackets.get(ch)){
//                 return false;
//             }
            
//        }
//     }

//           return stack.isEmpty();

// }}





// class Main {

//           public static boolean binarySearch(int[] arr, int target) {

//                     int n = arr.length;
//                     int low = 0;
//                     int high = n - 1;

//                     while (low <= high) {
//                               int mid = low + (high - low) / 2;

//                               if (arr[mid] == target)
//                                         return true;

//                               if (arr[mid] > target) {
//                                         high = mid - 1;
//                               } else {
//                                         low = mid + 1;
//                               }
//                     }
//                     return false;

//           }

//           public static void main(String[] args) {
//                     int[] arr = { 2, 3, 4, 5, 6 };
//                     int target = 4;
//                     System.out.println(binarySearch(arr, target));
//           }
// }




// class Main {

//           public static void bubbleSort(int[] arr) {
//                     int n = arr.length;

//                     for (int i = 0; i < n - 1; i++) {
//                               for (int j = 0; j < n - i - 1; j++) {
//                                         if (arr[j] > arr[j + 1]) {
//                                                   int temp = arr[j];
//                                                   arr[j] = arr[j + 1];
//                                                   arr[j + 1] = temp;
//                                         }
//                               }
//                     }

//           }

//           public static void printArr(int[] arr) {
//                     for (int i = 0; i < arr.length; i++) {
//                               System.out.print(arr[i] + " ");
//                     }

//                     System.out.println();
//           }

//           public static void main(String[] args) {
//                     int[] arr = { 5, 4, 3, 2, 1 };

//                     printArr(arr);
//                     bubbleSort(arr);
//                     printArr(arr);
//           }
// }





// class Main {

//           public static boolean isPrime(int n) {

//                     if (n == 0)
//                               return false;
//                     if (n == 1)
//                               return false;
//                     int count = 0;
//                     for (int i = 1; i <= n; i++) {
//                               if (n % i == 0) {
//                                         count++;

//                               }
//                     }

//                     return count == 2;
//           }

//           public static void main(String[] args) {
//                     int n = 16;
//                     System.out.println(isPrime(n));
//           }
// }



// class Main {

//           public static boolean isPrime(int n) {

//                     if (n <= 1)
//                               return false;
//                     for (int i = 2; i * i <= n; i++) {
//                               if (n % i == 0) {
//                                         return false;

//                               }
//                     }

//                     return true;
//           }

//           public static void main(String[] args) {
//                     int n = 11;
//                     System.out.println(isPrime(n));
//           }
// }




// class Main {

//           public static void main(String[] args) {
//                     int n = 5;

//                     int a = 0;
//                     int b = 1;

//                     for (int i = 0; i <= n; i++) {
//                               System.out.print(a + " ");
//                               int curr = a + b;
//                               a = b;
//                               b = curr;
//                     }
//           }
// }