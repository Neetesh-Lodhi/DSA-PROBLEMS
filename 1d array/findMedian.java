
import java.util.*;

class Main {

    public static void findMedian(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        //for odd length
        if (n % 2 != 0) {
            System.out.println(arr[n / 2]);
        } else {
            //for even length
            double median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;  //ans is 3.5 = 3.0+4.0/2.0
            System.out.println(median);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        findMedian(arr);
    }
}
