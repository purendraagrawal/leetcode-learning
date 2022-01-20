class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1;
        for(int pile:piles){
            end = Math.max(end, pile);
        }
        while(start<end){
            int mid = start + (end-start)/2;
            int temp = 0;
            for(int pile:piles){
                temp = temp + (int)Math.ceil((double)pile / mid);
            }
            if(temp<=h)
                end = mid;
            else if(temp>h){
                start = mid+1;
            }
        }
        return end;
    }
}