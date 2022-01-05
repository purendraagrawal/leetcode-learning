class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb3 = new StringBuilder();
        for(int i=0;i<s1.length;i++){
            sb3.append(reverse(s1[i]));
            if(i!=s1.length-1){
                sb3.append(" ");
            }
        }
        return sb3.toString();
    }
    
    public String reverse(String s){
        int start =0;
        int end = s.length()-1;
        char[] c = s.toCharArray();
        while(start<end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(c);
    }
}