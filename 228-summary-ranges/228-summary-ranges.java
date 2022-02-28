class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            int end = start;
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                end = nums[i+1];
                i++;
            }
            if(start!=end){
                StringBuilder sb = new StringBuilder();
                sb.append(start).append("->").append(end);
                result.add(sb.toString());
            }else
                result.add(String.valueOf(start));
        }
        return result;
    }
}