class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int left=0, right = -1;
        int max = nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]<max)
                right = i;
            max = Math.max(max, nums[i]);
        }
        
        int min = nums[len-1];
        for(int j = len-2;j>=0;j--){
            if(nums[j]>min){
                left = j;
            }
            min = Math.min(min, nums[j]);
        }
        return right-left+1;
    }
}          