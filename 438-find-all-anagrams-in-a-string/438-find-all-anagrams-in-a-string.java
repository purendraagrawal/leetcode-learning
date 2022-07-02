class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int lenOfS = s.length();
        int lenOfP = p.length();
        if(lenOfS < lenOfP)
            return result;
        for(int i =0 ; i <lenOfS-lenOfP+1 ; i++){
            if(isAnagram(s.substring(i, i+lenOfP),p))
                result.add(i);
        }
        return result;
    }
    
    public boolean isAnagram(String s, String p){
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-97]++;
        }
        for(char c : p.toCharArray()){
            arr[c-97]--;
        }
        for(int i : arr){
            if(i!=0)
                return false;
        }
        return true;
    }
}