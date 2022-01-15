class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lengthOfS1 = s1.length();
        int lengthOfS2 = s2.length();
        if(lengthOfS1>lengthOfS2)
            return false;
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<lengthOfS1;i++){
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<lengthOfS2-lengthOfS1;i++){
            if(isMatch(s1Arr, s2Arr))
                return true;
            s2Arr[s2.charAt(i+lengthOfS1)-'a']++;
            s2Arr[s2.charAt(i)-'a']--;
        }
        return isMatch(s1Arr, s2Arr);
    }
    
    public boolean isMatch(int[] s1Arr, int[] s2Arr){
        for(int i=0;i<s1Arr.length;i++){
            if(s1Arr[i]!=s2Arr[i]){
                return false;
            }
        }
        return true;
    }
}