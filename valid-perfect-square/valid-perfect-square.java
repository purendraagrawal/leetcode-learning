class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1 || num == 0)
			return true;
		long start = 2;
		long end = num / 2;
		long nums = (long) num;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			if (mid * mid == nums)
				return true;
			else if (mid * mid < nums) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
    }
}