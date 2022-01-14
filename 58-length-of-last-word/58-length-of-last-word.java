class Solution {
    public int lengthOfLastWord(String s) {
    char[] c = s.toCharArray();
    int len = c.length-1;
        int length=0;
        for(int i = len;i>=0;i--){
            if(c[i]!=' '){
                length++;
            }else{
                if(length>0)
                    return length;
            }
        }
        return length;
    }
}