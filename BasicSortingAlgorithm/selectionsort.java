
/*

    public static void selectionSort(int[] arr){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                   minIndex = j;
                }
            }
            
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        
        }
    }
    
    
    public static void main(String[] args) {
       int[] arr = {13,46,24,52,20,9};
        
         selectionSort(arr);
         for(int x : arr){
             System.out.print(x + " ");
         }
         System.out.println();
    }


*/

public class selectionsort {

    public static void SelectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swaps
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 38, 52, 9, 18, 6, 62, 13 };
        int n = arr.length;
        printArr(arr);
        SelectionSort(arr, n);
        printArr(arr);
    }
}








// public class SelectionSort {

//     // ✅ Step 1: Implement Selection Sort
//     public static void selectionSort(int arr[], int n) {
//         for (int i = 0; i < n - 1; i++) { // Loop runs n-1 times
//             int minIndex = i; // Assume the current index is the minimum
//             for (int j = i + 1; j < n; j++) { // Find the minimum element in the remaining array
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j; // Update minIndex if a smaller element is found
//                 }
//             }
//             // Swap the found minimum element with the first element of the unsorted part
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//     }

//     // ✅ Step 2: Print the Array
//     public static void printArr(int arr[]) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {38, 52, 9, 18, 6, 62, 13};
//         int n = arr.length;

//         System.out.println("Original Array:");
//         printArr(arr);

//         // Sorting the array
//         selectionSort(arr, n);

//         System.out.println("Sorted Array:");
//         printArr(arr);
//     }
// }
























// import java.util.*;

// public class selectionsort {
//     public static void printSelectionSort(int arr[]) {
//         // time complexity O(n2)
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minPos = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minPos] > arr[j]) {
//                     minPos = j;
//                 } 
//             }// swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 2, 6, 4, 8, 1, 9 };
//         printSelectionSort(arr);
//         printArr(arr);
//     }
// }
