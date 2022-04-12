class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int result = 0;
        for(int i=0;i<arr1.length;i++){
            int firstNum = arr1[i] - d;
            int secondNum = arr1[i] + d;
            int start = 0;
            int len = arr2.length;
            int end = len-1;
            boolean found = false;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr2[mid] >= firstNum && arr2[mid] <= secondNum ){
                    found=true;
                    break;   
                }else if(arr2[mid]<firstNum)
                    start = mid+1;
                else if(arr2[mid]>secondNum)
                    end = mid-1;
            }
            if(!found){
                result++;
            }
        }
        return result;
    }
}
//1,8,9,10