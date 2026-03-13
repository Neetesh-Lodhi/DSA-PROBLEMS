
public class bubblesort {

    /*
     * //t.c-O(n^2)
     * 1. Definition (Start like this) - Bubble sort works by repeatedly swapping
     * adjacent elements to push the largest element to the end.”
     * 
     * Bubble Sort is a simple comparison-based sorting algorithm where we
     * repeatedly compare adjacent elements and swap them if they are in the wrong
     * order.
     * With each pass, the largest element “bubbles up” to the end of the array.
     * 
     * 2. Intuition (Very Important)
     * 
     * Just like air bubbles rise to the top of water, the largest element moves to
     * the end of the array after every pass.
     */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }

}



/*

optimized bubble sort if array is already sorted reduces time complexity from o(n^2) to O(n) - swap-flag optimization

  public static void bubbleSort(int[] arr){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int didSwap = 0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }
    
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       printArr(arr);
       bubbleSort(arr);
       printArr(arr);
    }

*/


 
