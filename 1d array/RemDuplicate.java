public class RemDuplicate {
          class Main {

                    public static int remDuplicates(int[] arr) {
                              int count = 0;
                              int n = arr.length;

                              for (int i = 0; i < n; i++) {
                                        if (i < n - 1 && arr[i] == arr[i + 1]) {
                                                  continue;
                                        } else {
                                                  arr[count] = arr[i];
                                                  count++;
                                        }

                              }
                              return count;

                    }

                    public static void main(String[] args) {
                              int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
                              int size = remDuplicates(arr);

                              for (int i = 0; i < size; i++) {
                                        System.out.print(arr[i] + " ");
                              }
                              System.out.println();
                    }
          }
}

/*
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,9,9,2,2,3,3};
        
        HashSet<Integer> set = new HashSet<>(); //hashset doent maintain order , linkedhashset maintain order
        
        for(int num : arr){
            set.add(num);
        }
        
        System.out.println(set + " ");
    }
}
*/


/*
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,9,9,2,2,3,3};
        
        HashSet<Integer> set = new LinkedHashSet<>(); //preserve order 
        
        for(int num : arr){
            set.add(num);
        }
        
        int[] newArr = new int[set.size()]; // convert into array
        int i=0;
        for(int num : set){
            newArr[i++] = num;
        }
        
        System.out.println(Arrays.toString(newArr));
        
        
    }
}
*/
