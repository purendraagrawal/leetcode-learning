class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);
        int len = nums.length;
    List<List<Integer>> mainList = new ArrayList<>();
     for(int i =0;i<len;i++){
         if(i>=1 && nums[i]==nums[i-1])
             continue;
         int firstNum = nums[i];
         int low = i+1;
         int high = len-1;
         while(low<high){
             int secondNum = nums[low];
             int thirNum = nums[high];
             int sum = firstNum+secondNum + thirNum;
             if(sum == 0){
                 List<Integer> list = new ArrayList<>();
                 list.add(firstNum);
                 list.add(secondNum);
                 list.add(thirNum);
                 mainList.add(list);
                 low++;
                 high--;
                 while(low<high && nums[low]==nums[low-1]){
                     low++;
                 }
                 while(low<high && nums[high]==nums[high+1]){
                     high--;
                 }
             }else if(sum<0){
                 low++;
             }else{
                 high--;
             }
         }
      }
        return mainList;
    }
}