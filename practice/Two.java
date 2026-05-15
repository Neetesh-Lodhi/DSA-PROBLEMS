public class Two {
          public int[] twoSum(int[] numbers, int target) {
                    int n = numbers.length; // T.C-O(n)
                    int sum = 0;
                    int left = 0;
                    int right = n - 1;

                    for (int i = 0; i < n; i++) {
                              sum = numbers[left] + numbers[right];

                              if (sum == target)
                                        return new int[] { left + 1, right + 1 };

                              if (sum < target) {
                                        left++;
                              } else if (sum > target) {
                                        right--;
                              }
                    }

                    return new int[] { -1, -1 };
          } 
}
