class MergeIn {
           public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]); //sort according to easy start value for easy calculation

        List<int[]> result = new ArrayList<>(); //S.C-O(n)

        int start = intervals[0][0]; //T.C-O(nlogn)
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){ //start with interval 1 not 0
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart <= end){ //overlapping condition
            // Overlapping → merge by taking max end
              end = Math.max(end,currentEnd);
            }else {
                //if non-overlapping condition - then add the previous intervals
               // No overlap → store previous and move ahead
                result.add(new int[] {start,end});

                //update start and end with current interval start and end
                start = currentStart;
                end = currentEnd;
            }
        

        }
       //At the end add last interval in list
        result.add(new int[]{start,end});

        //And return the result - convert list to array
        return result.toArray(new int[result.size()][]);

    }
}