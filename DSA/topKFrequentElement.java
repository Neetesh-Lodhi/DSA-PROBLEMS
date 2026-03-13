import java.util.*;
public class topKFrequentElement {
      
 

          public static int[] topKelement(int[] nums, int k) {
                    HashMap<Integer, Integer> map = new HashMap<>();
                    int freq = 0;
                    for (int i = 0; i < nums.length; i++) {

                              map.put(i, nums[i]);

                              PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                              minHeap.add(freq);

                              if (minHeap.size() > k) {
                                        minHeap.poll();
                              }
                    }
                    return new int{minHeap.pop()};
          }
          public static void main(String[] args) {
                int nums[] = {1,2,2,3,3,3};
                int k = 2;
                topKelement(nums, k);
          }
}
