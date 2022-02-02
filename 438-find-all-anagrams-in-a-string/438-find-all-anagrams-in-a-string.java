class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lengthOfS = s.length();
        int lengthOfP = p.length();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<lengthOfS-lengthOfP+1;i++){
            String sub = s.substring(i,i+lengthOfP);
            if(isAnagram(sub,p)){
                list.add(i);
            }    
        }
        return list;
    }
    
    public boolean isAnagram(String s, String p){
        if(s.length()!=p.length())
            return false;
        
        char[] value = new char[26];
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        for(int i = 0;i<sArr.length;i++){
            value[sArr[i]-97]++;
            value[pArr[i]-97]--;
        }
        for(int i=0;i<value.length;i++){
            if(value[i]!=0)
                return false;
        }
        return true;
    }
}