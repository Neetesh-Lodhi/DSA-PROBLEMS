class Com{
           public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();  //  stores all valid combinations
        List<Integer> combination = new ArrayList<>();   //T.C-o(N^T)

        backtrack(target, result, combination, 0, candidates);
        return result;
    }

    public void backtrack(int target, List<List<Integer>> result,
                          List<Integer> combination, int start, int[] candidates) {
        //  base case 1: valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        //  base case 2: invalid path (sum exceeds target)
        if (target < 0) {
            return;
        }

        // explore all candidates starting from 'start'
        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            backtrack(target - candidates[i], result, combination, i, candidates);
            combination.remove(combination.size() - 1); // backtrack
        }
    }
}