import java.util.*;
public class kthLargest {
        
          public static void main(String[] args) {
                    int arr[] = { 6, 8, 2, 9 };
                    int k = 2;

                    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                    for (int num : arr) {
                              minHeap.add(num);

                              if (minHeap.size() > k) {
                                        minHeap.poll();
                              }
                    }
                    System.out.println(k + "th largest element is : " + minHeap.peek());

          }
}
