class Fib {
           int[] dp;
    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }

    public int solve(int i){
        if(i <= 1) return i;

        if(dp[i] != -1){
            return dp[i];
        }

        dp[i] = solve(i-1) + solve(i-2);
        return dp[i];
    }
}