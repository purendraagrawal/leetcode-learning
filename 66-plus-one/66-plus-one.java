class Solution {
    public int[] plusOne(int[] digits) {
     	int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
		}

		int[] digits1 = new int[length + 1];
		digits1[0] = 1;
		return digits1;
    }
}