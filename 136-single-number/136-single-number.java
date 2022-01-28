class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
      for(int i : nums){
          //XOR operator.. It will return 0 when both the numbers are same
          num ^= i;
      }
        return num;
    }
}