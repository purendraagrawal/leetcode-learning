    class Solution {
        public char findTheDifference(String s, String t) {
            int[] result = new int[26];
            for(char c : s.toCharArray()){
                result[c-97]++;
            }
            for(char c : t.toCharArray()){
                result[c-97]--;
            }
            char ans = 'a';
            for(int i=0;i<result.length;i++){
                if(result[i]==-1){
                    ans = (char)(97+i);
                    break;
                }
            }
            return ans;
        }
    }  