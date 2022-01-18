class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        char[] pArr = pattern.toCharArray();
        if(pattern.length()!=sArr.length)
            return false;
        Map<String,Character> map = new HashMap<>();
        Set<String> keySet = new HashSet<>();
        Set<Character> valueSet = new HashSet<>();
        for(int i=0;i<sArr.length;i++){
            Character value = Character.valueOf(pArr[i]);
            String key = sArr[i];
            keySet.add(key);
            valueSet.add(value);
            if(keySet.size()!=valueSet.size() || (map.containsKey(key) && map.get(key)!=value))
                return false;
            else
                map.put(key,value);
        }
        return true;
    }
}