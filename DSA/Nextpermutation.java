import java.util.*;
public class Nextpermutation {
        

        public static void nextPermutation(int[] nums) {
            int n = nums.length;
            int pivot = -1;

            // Step 1: Find the pivot
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    pivot = i;
                    break;
                }
            }

            // Step 2: If a pivot is found
            if (pivot != -1) {
                for (int i = n - 1; i > pivot; i--) {
                    if (nums[i] > nums[pivot]) {
                        swap(nums, pivot, i);
                        break;
                    }
                }
            }

            // Step 3: Reverse the suffix
            reverse(nums, pivot + 1, n - 1);
        }

        // Helper: Swap two elements
        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Helper: Reverse array from start to end
        private static void reverse(int[] nums, int start, int end) {
                  while (start < end) {
                            swap(nums, start, end);
                            start++;
                            end--;
                  }
        }
        
        public static void main(String[] args) {
                  int[] arr = { 1, 2, 3, 6, 5, 4 };
                  nextPermutation(arr);
                  System.out.println(Arrays.toString(arr));



        }
    }
                 

