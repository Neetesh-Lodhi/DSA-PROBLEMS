public class MergeTwoArraysWithoutUsingExtraSpace {
          
          public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) { //TC-O(m+n) , SC-0(1)
                    int idx = m + n - 1;
                    int i = m - 1;
                    int j = n - 1;

                    while (i >= 0 && j >= 0) {
                              if (nums1[i] >= nums2[j]) {
                                        nums1[idx] = nums1[i];
                                        idx--;
                                        i--;
                              } else {
                                        nums1[idx] = nums2[j];
                                        idx--;
                                        j--;
                              }
                    }

                    while (j >= 0) { //if elements left in j so just copy in nums1[idx]
                           nums1[idx] = nums2[j];
                           idx--;
                           j--;   
                    }
          }
          public static void main(String[] args) {
                    int[] nums1 = {1, 2, 3, 0, 0, 0};
                    int m = 3;
                    int[] nums2 = {2, 5, 6};
                    int n = nums2.length;

                    mergeArrays(nums1, m, nums2, n);

                    for (int num : nums1) {
                              System.out.print(num + " ");
                    }
          }
}
