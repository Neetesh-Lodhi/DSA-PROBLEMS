
//sliding window
public class MaxSumSubArray {

    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum = 0 , subSeq = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
            
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + findMaxSumSubArray(k, arr));
    }
}      
