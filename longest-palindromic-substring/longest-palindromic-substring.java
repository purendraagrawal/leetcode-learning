class Solution {
    public String longestPalindrome(String s) {
        int lenOfS = s.length();
        String longest = "";
        boolean dp[][] = new boolean[lenOfS][lenOfS];
        for(int g=0;g<lenOfS;g++){
            for(int i=0,j=i+g;j<lenOfS;i++,j++){
                if(g==0)
                    dp[i][j]=true;
                else if(g==1)
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
                        dp[i][j]=true;
                }
            if(dp[i][j]==true)
                longest = s.substring(i,j+1);
            }
        }
        return longest;
    }
}