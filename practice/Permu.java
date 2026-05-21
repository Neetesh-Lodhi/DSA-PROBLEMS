class Permu {
          public List<List<Integer>> permute(int[] nums) {
                    List<List<Integer>> result = new ArrayList<>();
                    boolean[] used = new boolean[nums.length];
                    ArrayList<Integer> current = new ArrayList<>();

                    backtrack(result, current, used, nums);
                    return result;
          }

          public void backtrack(List<List<Integer>> result, ArrayList<Integer> current, boolean[] used, int[] nums) {

                    if (current.size() == nums.length) {
                              result.add(new ArrayList<>(current));
                              return;
                    }

                    for (int i = 0; i < nums.length; i++) {
                              if (!used[i]) {
                                        current.add(nums[i]);
                                        used[i] = true;
                                        backtrack(result, current, used, nums);
                                        used[i] = false;
                                        current.remove(current.size() - 1);
                              }
                    }
          }
}