class Solution {
    public int threeSumClosest(int[] nums, int target) {   
     int size = nums.length;
        int closestSum=Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        if(size==3)
            return nums[0]+nums[1]+nums[2];
        else{
            for(int i=0;i<size-2;i++){
                int first = nums[i];
                for(int j=i+1;j<size-1;j++){
                    int second = nums[j];
                 for(int k = j+1;k<size;k++){
                     int third = nums[k];
                     int sum = first+second+third;
                     int diff = Math.abs(sum-target);
                    if(min>diff){
                        closestSum = sum;
                        min= diff;
                    }
                 }   
                }
            }
        }
        return closestSum;
    }
}