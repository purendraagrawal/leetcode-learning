class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
     int[] res = new int[len];
        int i = 0;
        int j = len-1;
        for(int num:nums){
            if(num%2==0){
                res[i++]= num;
            }else{
                res[j--]=num;
            }
        }
        return res;
    }
}