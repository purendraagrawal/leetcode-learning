class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        char lastLetter = letters[len-1];
        if(target>=lastLetter)
            return letters[0];
        int start = 0;
        int end = len-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]==target){
                while(mid<len && letters[mid]==letters[mid+1]){
                    mid++;
                }
                return letters[mid+1];
            }else if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
}