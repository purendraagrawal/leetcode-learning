class Solution {
    public int lengthOfLongestSubstring(String s) {
       int ans = 0;
		for(int i = 0;i<s.length();i++) {
			for(int j =i;j<s.length();j++) {
				if(allUnique(s, i, j))
					ans = Math.max(ans, j-i+1);
				else
					break;
			}
		}
		return ans;
	}

	public boolean allUnique(String s, int start, int end) {
		boolean[] array = new boolean[128];
		for (int i = start; i <= end; i++) {
			if(array[s.charAt(i)] == true)
				return false;
			array[s.charAt(i)] = true;
		}
		return true;
    }
}