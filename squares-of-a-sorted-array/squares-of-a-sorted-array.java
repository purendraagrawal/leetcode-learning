class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-1*nums[i];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
}