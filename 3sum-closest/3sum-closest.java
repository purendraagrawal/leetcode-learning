class Solution {
    public int threeSumClosest(int[] nums, int target) {
     Arrays.sort(nums);
		int size = nums.length;
		int closestSum = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		if (size == 3)
			return nums[0] + nums[1] + nums[2];
		else {
			for (int i = 0; i < size; i++) {
				int first = nums[i];
				int j = i + 1;
				int k = size - 1;
				while (j < k) {
					int second = nums[j];
					int third = nums[k];
					int sum = first + second + third;
					int diff = Math.abs(sum - target);
					if (min > diff) {
						closestSum = sum;
						min = diff;
						if (diff == 0)
							break;
					}
					if (sum > target)
						k--;
					else
						j++;
				}
				if (min == 0)
					break;
			}

		}
		return closestSum;
    }
}