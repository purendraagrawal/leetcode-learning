class Solution {
    
    int len = 0;
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        len = nums.length;
        return kSum(nums, 0, target, 4);
    }
    public List<List<Integer>> kSum(int[] nums, int index, int target, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (index >= len) {
            return result;
        }
        if (k == 2) {
            int startIndex = index;
            int endIndex = len - 1;
            while (startIndex < endIndex) {
                int sum = nums[startIndex] + nums[endIndex];
                if (sum == target) {
                    List<Integer> twoSumList = new ArrayList<>();
                    twoSumList.add(nums[startIndex]);
                    twoSumList.add(nums[endIndex]);
                    result.add(twoSumList);
                    // To Skip Duplicates
                    while (startIndex < endIndex && nums[startIndex] == nums[startIndex + 1])
                        startIndex++;
                    while (startIndex < endIndex && nums[endIndex] == nums[endIndex - 1])
                        endIndex--;
                    startIndex++;
                    endIndex--;
                } else if (sum < target) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        } else {
            for (int i = index; i < len - k + 1; i++) {
                List<List<Integer>> kResult = kSum(nums, i + 1, target - nums[i], k - 1);
                if (kResult != null) {
                    for (List<Integer> temp : kResult) {
                        temp.add(0, nums[i]);
                    }
                    result.addAll(kResult);
                }
                //To Skip Duplicates
                while (i < len - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return result;
    }
}