/*


 public static void insertionSort(int[] arr){
        int n = arr.length;
          
          for(int i=1;i<n;i++){
              int key = arr[i];
              int j = i-1;
              
              while( j >= 0 && arr[j] > key){
                   arr[j+1] = arr[j];
                   j--;
              } 
              
              arr[j+1] = key;
          }
    }
    public static void main(String[] args) {
        int[] arr = {7,4,1,5,3};
        insertionSort(arr);
        
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

*/


public class Insertionsort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

           
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 0, 1, 5 };
        printArr(arr);
        insertionSort(arr);
        printArr(arr);

    }
}
































// import java.util.*;

// public class insertionsort {// time complexity O(n2) teeno ki time complexitiy same hai

//     public static void insertionSort(Integer arr[]) {
//         for (Integer i = 1; i < arr.length; i++) {
//             Integer curr = arr[i];
//             Integer prev = i - 1;
//             // finding out the correct position to insert
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev + 1] = curr;
//         } // void is invalid type of printarr error aaye to samahjh lena curly brackets
//         // gadbad lagaye huye hai
//     }

//     public static void printArr(Integer arr[]) {
//         for (Integer i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]) {
//         Integer[] arr = {4, 3, 2, 5, 1};
//         // insertionSort(arr);
//         // Arrays.sort(arr);//inbuilt sort//ascending order sorted array
//         // Arrays.sort(arr,1,3);//complexity of inbuilt sort is O(n logn)
//         //   Arrays.sort(arr,Collections.reverseOrder());//works for descending order//it uses comparator internally
//         Arrays.sort(arr, 0, 3, Collections.reverseOrder());
//         printArr(arr);
//     }

// }
