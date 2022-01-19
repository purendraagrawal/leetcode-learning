class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m>0 && n>0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }else{
                nums1[m+n-1] = nums1[m-1];
                nums1[m-1] =0;
                m--;
            }
        }
        
        if(m==0 && n!=0){
            for(int k =0;k<n;k++){
                nums1[k] = nums2[k];
            }
        }
    }
}