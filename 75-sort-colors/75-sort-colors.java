class Solution {
    public void sortColors(int[] nums) {
        int cntZero = 0, cntOne = 0, cntTwo = 0;
        for(int i:nums){
            if(i==0)
                cntZero++;
            else if(i==1)
                cntOne++;
            else
                cntTwo++;
        }
        
        int i = 0;
        while(i<nums.length){
            while(cntZero!=0){
                nums[i] = 0;
                cntZero--;
                i++;
            }
            
            while(cntOne!=0){
                nums[i] = 1;
                cntOne--;
                i++;
            }
            
            while(cntTwo!=0){
                nums[i] = 2;
                cntTwo--;
                i++;
            }
        }
    }
}