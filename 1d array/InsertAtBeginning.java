public class InsertAtBeginning {

          //insert at beginning
          public static int[] insert(int[] arr, int x) {
                    int n = arr.length;
                    //create new arr of size plus 1
                    int[] newArr = new int[n + 1];

                    //place element at position 0;
                    newArr[0] = x;

                    //copy all elements into newArrays from old array
                    for (int i = 0; i < n; i++) {
                              newArr[i + 1] = arr[i];
                    }

                    return newArr;
          }

          public static void main(String[] args) {
                    int[] arr = { 2, 3, 4, 5 };
                    int x = 1;
                    int[] result = insert(arr, x);
                    for (int num : result) {
                              System.out.print(num + " ");
                    }
                    System.out.println();

          }
}



//insert at ending


/*

 public static int[] insert(int[] arr,int x){
        int n = arr.length;
        int[] newArr = new int[n+1];
        
        newArr[n] = x;
        
        for(int i=0;i<n;i++){
            newArr[i] = arr[i];
        }
        
        return newArr;
    }
    public static void main(String[] args) {
      int[] arr = {2,3,4,5};
      int x = 1;
      int[] result = insert(arr,x);
      for(int num : result){
          System.out.print(num + " ");
      }
      System.out.println();
      
    }

*/
