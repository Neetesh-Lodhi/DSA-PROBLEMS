import java.util.PriorityQueue;

class MinOperation {
            public int halveArray(int[] nums) {
        PriorityQueue<Double> maxHeap = new PriorityQueue<>((a,b)->Double.compare(b,a));
    
    double totalSum = 0;
    for(int num : nums){
        maxHeap.add((double)num);
        totalSum+=num;
    }

      
      double target = totalSum / 2.0;
      double reduced = 0;
      int operations = 0;

    
        while(reduced < target){
           double current = maxHeap.poll();
           double half = current/2.0;
            reduced += half;
           maxHeap.offer(half);
           operations++;

        }

        return operations;
    }
}