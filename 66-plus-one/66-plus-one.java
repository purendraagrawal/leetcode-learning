class Solution {
    public int[] plusOne(int[] digits) {
     int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] digits1 = new int[len+1];
        digits1[0] = 1;
        return digits1;
    }
}