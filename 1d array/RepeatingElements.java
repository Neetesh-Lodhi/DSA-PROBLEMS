
import java.util.*;


class RepeatElement {
    
    public static void RepeatElement(int[] arr){
       HashMap<Integer,Integer> map = new HashMap<>();
       
       
       //count the frequency of elements
       for(int num : arr){
           map.put(num,map.getOrDefault(num,0)+1);
       }
       
       //print Elemnts that is non repeat in array
       
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue() == 1){
               System.out.print(entry.getKey() + " ");
           }
       }
      
    } 
       
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,3,4,7,8,10,11,11};
        RepeatElement(arr);
      
       
    }
} 

  


// import java.util.Arrays;

// public class RepeatingElements {

//     static void findRepeatingElements(int arr[]) {
//         Arrays.sort(arr);

//         System.out.print("The repeating elements are: ");
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] == arr[i + 1]) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 3, 4, 4, 5, 2};
//         findRepeatingElements(arr);
//     }
// }
