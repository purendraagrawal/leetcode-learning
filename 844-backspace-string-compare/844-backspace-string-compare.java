class Solution {
    public boolean backspaceCompare(String s, String t) {
        return convert(s).equals(convert(t));
    }
    
    public String convert(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='#'){
                int len  = sb.length();
                if(len>0)
                    sb.deleteCharAt(sb.length()-1);
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}