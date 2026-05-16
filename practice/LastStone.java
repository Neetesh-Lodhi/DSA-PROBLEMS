import java.util.*;
class LastStone{
           public int lastStoneWeight(int[] stones) {
        //create a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int stone : stones){
            maxHeap.add(stone);
        }
     
     //continuously remove and smash the two heivest stones
        while(maxHeap.size()>1){
            int y = maxHeap.poll(); //the heiveist stone
            int x = maxHeap.poll();  // the second heiviest stone 

            if(x!=y){
                maxHeap.add(y-x); //add the remaining stone back to the heap
            }
        }
        //return the weight of last stone if no element left return 0;
        return maxHeap.isEmpty()?0:maxHeap.poll();
    }
}