class Solution {
    public int climbStairs(int n) {
        
        // try to represent a problem in terms of index
        // do all poss stuff on that index acc to the problem statement
        // sum of all stuff -> count all ways
        // find min then take min of all the stuff
        //    Appraoch 1
        // if(n==1 || n==0)return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    private int helper(int n , int dp[])
    {
        if(n==0 || n==1)return 1;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
}
