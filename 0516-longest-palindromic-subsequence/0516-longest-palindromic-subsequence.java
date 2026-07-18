class Solution {
    Integer dp[][];
    public int slv(int i,int j,String s)
    {
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
        {
            return 2+slv(i+1,j-1,s);
        }
        return dp[i][j]=Math.max(slv(i+1,j,s),slv(i,j-1,s));
    }
    public int longestPalindromeSubseq(String s) {
        dp=new Integer[s.length()][s.length()];
        return slv(0,s.length()-1,s);
        
    }
}