class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set <String> wordSet = new HashSet<>(wordDict);
        int maxLen = 0;
        for(String word:wordSet){
            maxLen = Math.max(maxLen, word.length());
        }
        int n=s.length();
        boolean dp[] = new boolean[n+1];
        for(int i =1; i<=n; i++){
            dp[0] = true;

            for(int j=i-1;j>=Math.max(0,i-maxLen);j--){
                if(dp[j] && wordSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}