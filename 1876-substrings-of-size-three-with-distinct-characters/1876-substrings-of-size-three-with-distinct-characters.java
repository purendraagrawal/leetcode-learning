class Solution {
    public int countGoodSubstrings(String s) {
       int result = 0;
        for(int i=0;i<s.length()-2;i++){
         int[] data = new int[26];
         data[s.charAt(i)-'a']++;
         data[s.charAt(i+1)-'a']++;
         data[s.charAt(i+2)-'a']++;
         if(data[s.charAt(i)-'a']==1 && data[s.charAt(i+1)-'a']==1 && data[s.charAt(i+2)-'a']==1)
            result++;   
        }
        return result;
    }
}