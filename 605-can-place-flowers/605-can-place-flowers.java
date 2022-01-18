class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0)
            return true;
        
        if(len == 1 && n<=len){
            if(flowerbed[0] == 0)
                return true;
            return false;
        }
        
        if(flowerbed[0]==0 && flowerbed[1] == 0){
            n--;
            flowerbed[0] = 1;
        }
        
        if(n<=0)
            return true;
        
        for(int i=1;i<len-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i] = 1;
                n--;
                if(n<=0)
                    return true;
            }
        }
        
        if(n<=0)
            return true;
        
        if(flowerbed[len-1] == 0 && flowerbed[len-2]==0){
            n--;
            flowerbed[len-1] = 1;
        }
        
        if(n<=0)
            return true;
        return false;
    }
}