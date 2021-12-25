class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
		List<Character> listOfCharacters = new ArrayList<>();
        licensePlate = licensePlate.toLowerCase();
        for(char c: licensePlate.toCharArray()){
            if(c>='a' && c<='z')
                listOfCharacters.add(c);
        }
        List<String> listOfString = new ArrayList<>();
        for(String word:words){
            List<Character> tempList = new ArrayList<>();
            for(Character c : listOfCharacters){
                tempList.add(c);
            }
            for(char c: word.toCharArray()){
                if(tempList.contains(Character.valueOf(c)))
                    tempList.remove(Character.valueOf(c));
            }
            if(tempList.isEmpty())
                listOfString.add(word);
        }
        String max = "";
        if(listOfString.size()>0)
            max = listOfString.get(0);
        for(int i=1;i<listOfString.size();i++){
            if(max.length()>listOfString.get(i).length())
                max = listOfString.get(i);
        }
        return max;
    }
}