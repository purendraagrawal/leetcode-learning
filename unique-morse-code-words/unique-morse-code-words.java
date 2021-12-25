class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> map = new HashMap<>();
        for(int i=0;i<morseCode.length;i++){
            int cInt =97+i;
            char c = (char)cInt;
            map.put(Character.valueOf(c),morseCode[i]);
        }
        Set<String> set = new HashSet<>();
        for(String word:words){
            StringBuilder stringBuild = new StringBuilder("");
            for(char c: word.toLowerCase().toCharArray()){
                stringBuild.append(map.get(Character.valueOf(c)));
            }
            set.add(stringBuild.toString());
        }
        return set.size();
    }
}