class Solution {
    public String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
		for (int i = 0; i < sb.length; i++)
			sb[i] = new StringBuffer();
		int i = 0;
		int len = s.length();
		while (i < len) {
			for (int idx = 0; idx < numRows && i < len; idx++) {
				sb[idx] = sb[idx].append(s.charAt(i));
				i++;
			}
			for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
				sb[idx] = sb[idx].append(s.charAt(i));
				i++;
			}
		}
		for (int j = 1; j < sb.length; j++) {
			sb[0] = sb[0].append(sb[j]);
		}
		return sb[0].toString();
    }
}