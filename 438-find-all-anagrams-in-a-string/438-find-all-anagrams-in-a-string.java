class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lengthOfS = s.length();
        int lengthOfP = p.length();
        List<Integer> list = new ArrayList<>();
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        int i = 0;
        if(lengthOfS==0 || lengthOfP==0 || lengthOfS<lengthOfP)
            return list;
        for(;i<lengthOfP;i++){
            pArr[p.charAt(i)-97]++;
            sArr[s.charAt(i)-97]++;
        }
        for(;i<lengthOfS;i++){
            int startIndex = i-lengthOfP;
            if(Arrays.equals(pArr,sArr))
                list.add(startIndex);
            sArr[s.charAt(startIndex)-97]--;
            sArr[s.charAt(i)-97]++;
        }
        if(Arrays.equals(pArr,sArr))
                list.add(lengthOfS-lengthOfP);
        return list;
    }
}