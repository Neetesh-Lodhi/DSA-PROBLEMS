public class Rotate {
          public void rotate(int[] arr, int k) {
                    int n = arr.length; // T.C-O(n)
                    k = k % n; // handle when k > n

                    reverse(arr, 0, n - 1); // Reverse entire array
                    reverse(arr, 0, k - 1); // Reverse first k
                    reverse(arr, k, n - 1); // Reverse remaining
          }

          public void reverse(int[] arr, int start, int end) {
                    while (start < end) {
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }
          }  
}
