class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int firstNum = nums[i];
            List<List<Integer>> listTwoSum = twoSum(nums, i+1 , -1*firstNum);
            if(!listTwoSum.isEmpty()){
                for(List<Integer> list : listTwoSum){
                    list.add(firstNum);
                }
                res.addAll(listTwoSum);
            }
            while(i<nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
        }//-4,-1,-1,0,1,2
        return res;
    }
    
    public List<List<Integer>> twoSum(int[] nums, int l, int target){
        List<List<Integer>> listTwoSum = new ArrayList<>();
        int h = nums.length-1;
        while(l<h){
            if(nums[l]+nums[h]==target){
                List<Integer> list = new ArrayList<>();
                list.add(nums[l]);
                list.add(nums[h]);
                while(l<h && nums[l] == nums[l+1]){
                    l++;
                }
                while(l<h && nums[h] == nums[h-1]){
                    h--;
                }
                l++;
                h--;
                listTwoSum.add(list);
            }else if(nums[l] + nums[h] < target){
                l++;
            }else{
                h--;
            }
        }
        return listTwoSum;
    }
}