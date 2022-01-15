class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lengthOfS1 = s1.length();
        int lengthOfS2 = s2.length();
        if(lengthOfS1>lengthOfS2)
            return false;
        int[] s1Arr = new int[26];
        for(int i=0;i<lengthOfS1;i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=lengthOfS2-lengthOfS1;i++){
            int[] s2Arr = new int[26];
            for(int j=0;j<lengthOfS1;j++){
                s2Arr[s2.charAt(i+j)-'a']++;
            }
            if(isMatch(s1Arr, s2Arr))
                return true;
        }
        return false;
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