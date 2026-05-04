class SubarraySizeK{
          public int longestSubarray(int[] arr, int k) {
                    // code here
                    int n = arr.length;
                    HashMap<Integer, Integer> map = new HashMap<>();

                    int maxLen = 0;
                    int sum = 0;

                    for (int i = 0; i < n; i++) {
                              sum += arr[i];

                              // case 1
                              if (sum == k) {
                                        maxLen = i + 1;
                              }

                              // case 2
                              if (map.containsKey(sum - k)) {
                                        int len = i - map.get(sum - k);
                                        maxLen = Math.max(len, maxLen);
                              }

                              // if its first occurence

                              if (!map.containsKey(sum)) {
                                        map.put(sum, i);
                              }

                    }

                    return maxLen;

          }
}