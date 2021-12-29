class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
		String ans = "", temp = "";
		for (int i = 0; i < s.length(); i++) {
			int end = s.length() - 1;
			if ((end - i) >= maxLen) {
				while (i <= end) {
					if (isPalindrome(s, i, end)) {
						temp = s.substring(i, end + 1);
						maxLen = Math.max(maxLen, temp.length());
						if (maxLen == temp.length()) {
							ans = temp;
							break;
						}
					}
					end--;
				}
			} else
				break;
		}
		return ans;
    }
    
    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}