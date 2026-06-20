import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {
       public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();  //T.C-O(nlogn)  , S.C-O(n)
        int n = nums.length;

        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());


        maxHeap.addAll(freq.entrySet());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }    
}
