class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-(k-1);i++){
            int min = nums[i];
            int max = nums[i+(k-1)];
            result = Math.min(result, max-min);
        }
        return result;
    }
}