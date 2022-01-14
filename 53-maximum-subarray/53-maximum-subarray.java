class Solution {
    public int maxSubArray(int[] nums) {
     int sum = nums[0];
        int max = sum;
        for(int i=1;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum<nums[i])
                sum = nums[i];
            if(max<sum)
                max=sum;
        }
        return max;
    }
}