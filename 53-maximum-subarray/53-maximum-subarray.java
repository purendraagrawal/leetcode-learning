class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int len = nums.length;
        
        if(len == 1){
            return ans;
        }
        int sum = nums[0];
       for(int i = 1 ; i < len ; i++){
           sum = sum + nums[i];
           sum = Math.max(sum, nums[i]);
           ans = Math.max (ans, sum);
       }
        
        return ans;
    }
}