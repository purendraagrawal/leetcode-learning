class Solution {
    public int reverse(int x) {
     int reverse = 0;
     int temp = x;
        boolean negative = false;
        if(temp<0){
            negative = true;
            temp=temp*-1;
        }
        while(temp>0){
            int r = temp % 10;
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && temp >7)
                return 0;
            reverse = reverse*10+r;
            int q = temp/10;
            temp = q;
        }
        if(negative)
            reverse = reverse * -1;
        return reverse;
    }
}