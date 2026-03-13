
import java.util.*;

class Main {

          public static void arrangeElements(int[] arr, int n) {
          
                    //first sort the array
                    //then print first half ascending order
                    //then print the remaining elements in descending order
        Arrays.sort(arr);  //T.C(n long n)

        for (int i = 0; i <= n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i > n / 2; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 6, 8, 3, 12};
        arrangeElements(arr, arr.length);
    }
}
