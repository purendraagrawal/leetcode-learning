class Solution {
    public int reverse(int x) 
    {
        int n = x;
        long flag = 0, rev = 0;
		
		// Checking wether the number is neagtive
		// * If negative make it positive by multiplying by " -1 "
		// * The flag is a reference if the number (x) is negative.
        if (x < 0) 
        {
            flag = 1;
            n = -1*n;
        }
		// Reversing the Integer by using mod 
        while (n > 0)
        {
            rev = rev * 10 + n % 10;
            n = n/ 10;
        }
		
        // If the reversed Integer is greater/lesser than Integer bounds (i.e [−2^31,  2^31 − 1]) then we return 0.
         if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE  ) 
            return 0;
			
        // If not the above condition if the number (x) is negative,
        // we multiply the reversed number (rev) by " -1 " to make it negative again and return it.
         else if (flag != 0)
            return -1 *(int) rev;
         else
            return (int)rev;
    } 
}