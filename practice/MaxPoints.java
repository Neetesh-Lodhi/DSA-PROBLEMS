public class MaxPoints {
          int maxScore = 0;
          int[] answer;

          public int[] maximumBobPoints(
                              int numArrows,
                              int[] aliceArrows) {

                    answer = new int[12];

                    dfs(
                                        11,
                                        numArrows,
                                        0,
                                        new int[12],
                                        aliceArrows);

                    return answer;
          }

          private void dfs(
                              int idx,
                              int arrowsLeft,
                              int score,
                              int[] bob,
                              int[] alice) {

                    if (idx < 0) {

                              if (score > maxScore) {

                                        maxScore = score;

                                        answer = bob.clone();

                                        answer[0] += arrowsLeft;
                              }

                              return;
                    }

                    int need = alice[idx] + 1;

                    if (arrowsLeft >= need) {

                              bob[idx] = need;

                              dfs(
                                                  idx - 1,
                                                  arrowsLeft - need,
                                                  score + idx,
                                                  bob,
                                                  alice);

                              bob[idx] = 0;
                    }

                    dfs(
                                        idx - 1,
                                        arrowsLeft,
                                        score,
                                        bob,
                                        alice);
          }    
}
