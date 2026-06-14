public class NextBeautiful {
          class Solution {

                    int answer = Integer.MAX_VALUE;

                    public int nextBeautifulNumber(int n) {

                              int[] digits = { 1, 2, 3, 4, 5, 6, 7 };

                              generate(0, digits, new int[8], n);

                              return answer;
                    }

                    private void generate(
                                        int idx,
                                        int[] digits,
                                        int[] count,
                                        int n) {

                              if (idx > 7)
                                        return;

                              build("", count, n);

                              if (idx == digits.length)
                                        return;

                              count[digits[idx]] = digits[idx];

                              generate(
                                                  idx + 1,
                                                  digits,
                                                  count,
                                                  n);

                              count[digits[idx]] = 0;

                              generate(
                                                  idx + 1,
                                                  digits,
                                                  count,
                                                  n);
                    }

                    private void build(
                                        String cur,
                                        int[] count,
                                        int n) {

                              if (!cur.isEmpty()) {

                                        int num = Integer.parseInt(cur);

                                        if (num > n)
                                                  answer = Math.min(answer, num);
                              }

                              for (int d = 1; d <= 7; d++) {

                                        if (count[d] == 0)
                                                  continue;

                                        count[d]--;

                                        build(
                                                            cur + d,
                                                            count,
                                                            n);

                                        count[d]++;
                              }
                    }
          } 
}
