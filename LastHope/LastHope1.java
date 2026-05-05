public class LastHope1 {

}


//o(n)  sp - o(n)

          // Boyer-Moore Voting Algorithm
          public List<Integer> majorityElement(int[] nums) {
                    int n = nums.length;
                    List<Integer> ans = new ArrayList<>(); // T.C-O(n) , S.C-O(1)
                    int life1 = 0;
                    int life2 = 0;
                    int candidate1 = Integer.MIN_VALUE;
                    int candidate2 = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                              if (nums[i] == candidate1) {
                                        life1++;
                              } else if (nums[i] == candidate2) {
                                        life2++;
                              } else if (life1 == 0) {
                                        candidate1 = nums[i];
                                        life1++;
                              } else if (life2 == 0) {
                                        candidate2 = nums[i];
                                        life2++;
                              } else {
                                        life1--;
                                        life2--;
                              }
                    }

                    int count1 = 0;
                    int count2 = 0;

                    for (int i = 0; i < n; i++) {
                              if (nums[i] == candidate1)
                                        count1++;
                              if (nums[i] == candidate2)
                                        count2++;
                    }
                    if (count1 > n / 3)
                              ans.add(candidate1);
                    if (count2 > n / 3)
                              ans.add(candidate2);
                    return ans;

          }


// 2nd approach

// class Solution {
// public List<Integer> majorityElement(int[] nums) {
// int n = nums.length;
// List<Integer> list = new ArrayList<>();
// HashMap<Integer,Integer> map = new HashMap<>();

// for(int i=0;i<n;i++){
// map.put(nums[i],map.getOrDefault(nums[i],0)+1);
// }

// for(Map.Entry<Integer,Integer> entry : map.entrySet()){
// if(entry.getValue() > n/3){
// list.add(entry.getKey());
// }
// }

// return list;
// }
// }







//o(n+m)
public void merge(int[] nums1, int m, int[] nums2, int n) {
          int idx = m + n - 1, i = m - 1, j = n - 1; // SC-O(1)

          while (i >= 0 && j >= 0) { // TC-O(m+n)
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
          while (j >= 0) {
                    nums1[idx] = nums2[j];
                    idx--;
                    j--;

          }
}







//o(log(n*m))

public boolean searchMatrix(int[][] matrix, int target) {
          int m = matrix.length;
          int n = matrix[0].length;

          int left = 0;
          int right = m * n - 1;

          while (left <= right) {
                    int mid = left + (right - left) / 2; // T.C-O(log(m*n))
                    int midValue = matrix[mid / n][mid % n];

                    if (midValue == target) {
                              return true;
                    } else if (midValue < target) {
                              left = mid + 1;
                    } else {
                              right = mid - 1;
                    }
          }
          return false;

}












//o(logn)

public int findPeakElement(int[] nums) {
          int n = nums.length;
          int left = 0;
          int right = n - 1;

          while (left < right) {
                    int mid = left + (right - left) / 2;

                    if (nums[mid] > nums[mid + 1]) {
                              right = mid;
                    } else {
                              left = mid + 1;
                    }
          }

          return left;
}







//o(n)
public int romanToInt(String s) {
          int result = 0;
          HashMap<Character, Integer> map = new HashMap<>();
          map.put('I', 1);
          map.put('V', 5);
          map.put('X', 10);
          map.put('L', 50);
          map.put('C', 100);
          map.put('D', 500);
          map.put('M', 1000);

          for (int i = 0; i < s.length(); i++) {
                    int currentVal = map.get(s.charAt(i));

                    if (i < s.length() - 1 && currentVal < map.get(s.charAt(i + 1))) {
                              result -= currentVal;
                    } else {
                              result += currentVal;
                    }

          }

          return result;

}










//max consecutive ones III - O(n)

public int longestOnes(int[] nums, int k) {
          int left = 0;
          int ones = 0;
          int maxLen = 0;

          for (int right = 0; right < nums.length; right++) {
                    if (nums[right] == 1) {
                              ones++;
                    }

                    while ((right - left + 1) - ones > k) {
                              if (nums[left] == 1) {
                                        ones--;
                              }
                              left++;
                    }
                    maxLen = Math.max(maxLen, right - left + 1);
          }

          return maxLen;
}






//o(nlog(n^3))
//sp - o(n)

public List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> ans = new ArrayList<>(); // T.C-O(nlgn + n^3)
          int n = nums.length;
          Arrays.sort(nums); // sort for two-pointer logic

          for (int i = 0; i < n - 3; i++) { // because this loop end 3 times before because j,p,q pointer are comes
                    if (i > 0 && nums[i] == nums[i - 1])
                              continue; // skip duplicates for i

                    for (int j = i + 1; j < n - 2; j++) { // this loop end 2 times before because p and q are already
                                                          // present
                              if (j > i + 1 && nums[j] == nums[j - 1])
                                        continue; // skip duplicates for j

                              int p = j + 1, q = n - 1;

                              while (p < q) {
                                        long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                                        if (sum < target) {
                                                  p++;
                                        } else if (sum > target) {
                                                  q--;
                                        } else {
                                                  ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                                                  p++;
                                                  q--;

                                                  // skip duplicates for p and q
                                                  while (p < q && nums[p] == nums[p - 1])
                                                            p++;
                                                  while (p < q && nums[q] == nums[q + 1])
                                                            q--;
                                        }
                              }
                    }
          }
          return ans;
}