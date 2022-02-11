class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lenOfS1 = s1.length();
        int lenOfS2 = s2.length();
        
        if(lenOfS1>lenOfS2)
            return false;
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        int end = 0;
        
        for(;end<lenOfS1;end++){
            arr1[s1.charAt(end)-97]++;
            arr2[s2.charAt(end)-97]++;
        }
        for(int start=0;end<lenOfS2;end++, start++){
            if(isArrayMatches(arr1, arr2))
                return true;
            arr2[s2.charAt(start)-97]--;
            arr2[s2.charAt(end)-97]++;
        }
        return isArrayMatches(arr1, arr2);
    }
    
    public boolean isArrayMatches(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}