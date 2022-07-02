class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int lenOfS = s.length();
        int lenOfP = p.length();
        if(lenOfS < lenOfP)
            return result;
        int[] freqOfP = getfrequency(p);
        for(int i =0 ; i <lenOfS-lenOfP+1 ; i++){
            int[] freqOfS = getfrequency(s.substring(i, i+lenOfP));
            if(areSame(freqOfP, freqOfS))
                result.add(i);
        }
        return result;
    }
    
    public int[] getfrequency(String s){
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-97]++;
        }
        return arr;
    }
    
    public boolean areSame(int[] s, int[] p){
        for(int i=0;i<s.length;i++){
            if(s[i]!=p[i])
                return false;
        }
        return true;
    }
}