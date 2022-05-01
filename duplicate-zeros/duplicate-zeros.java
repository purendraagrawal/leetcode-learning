class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int temp = 0;
        for(int i=0;i<len-1;i++){
            if(arr[i]==0){ 
               for(int j=len-1;j>i;j--){
                   arr[j] = arr[j-1];
               }
                i++;
            }
        }
    }
}

//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]


//[1,0,0,2,3,0,0,4]