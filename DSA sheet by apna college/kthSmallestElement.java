
//kth smallest element
import java.util.*;
public class kthSmallestElement {

          public static void main(String[] args) {
                    int arr[] = { 2, 4, 6, 8 ,3};
                    int k = 2;

                    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
                    for (int num : arr) {
                              maxHeap.add(num);
                              if (maxHeap.size() > k) {
                                        maxHeap.poll();
                              }
                    }
                    System.out.println(k + "th smallest element is : " + maxHeap.poll());
          }
}
