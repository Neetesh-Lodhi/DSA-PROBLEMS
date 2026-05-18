class MaxScore {
          public long maxKelements(int[] nums, int k) {
                    PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));

                    for (int num : nums) {
                              pq.offer((long) num);
                    }

                    long score = 0;
                    while (k > 0) {
                              long current = pq.poll();
                              score += current;

                              long next = (current + 2) / 3;

                              pq.offer(next);

                              k--;
                    }

                    return score;
          }
}