class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right =0;
        int len = nums.length;
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        while(left<len){
            if(sum<target && right<len){
                sum+=nums[right];
                right++;
            }else if(sum>=target){
                minLength = Math.min(minLength, right-left);
                sum-=nums[left];
                left++;
            }else{
                break;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}