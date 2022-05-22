class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, target, 4);
    }
    
    public List<List<Integer>> kSum(int[] nums, int l, int target, int k){
        List<List<Integer>> listKSum = new ArrayList<>();
        int h = nums.length-1;
        if(k==2){
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
                    listKSum.add(list);
                }else if(nums[l] + nums[h] < target){
                    l++;
                }else{
                    h--;
                }
            }
        }else{
            for(int i=l;i<nums.length-1;i++){
            int firstNum = nums[i];
            List<List<Integer>> res = kSum(nums, i+1 , target-firstNum , k-1);
            if(!res.isEmpty()){
                for(List<Integer> list : res){
                    list.add(firstNum);
                }
                listKSum.addAll(res);
            }
            while(i<nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
            }
        }
        return listKSum;
    }
}