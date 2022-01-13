class Solution {
    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
		char[] n = needle.toCharArray();
		int len = n.length;
		if (len == 0)
			return 0;
		for (int i = 0; i < h.length; i++) {
			int j = 0;
			for (; j < len && (i + j) < h.length; j++)
				if (h[i + j] != n[j])
					break;
			if (j == len)
				return i;
		}
		return -1;
    }
}