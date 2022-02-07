class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        char[] result = new char[26];
        for(char c : sArr){
            result[c-97]--;
        }
        for(char c : tArr){
            result[c-97]++;
        }
        char res='a';
        for(int i=0;i<result.length;i++){
            if(result[i]==1){
                res = (char)(i+97);
                break;
            }
        }
        return res;
    }
}