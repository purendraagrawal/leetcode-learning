class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length-1,nums.length-k);
    }
    
    public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}
    
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
    
    public static int findKthLargest(int[] arr, int low, int high, int k) {
		int pivot = partition(arr, low, high);

		if (pivot == k) {
			return arr[k];
		} else if (pivot < k) {
			return findKthLargest(arr, pivot + 1, high, k);
		} else
			return findKthLargest(arr, low, pivot - 1, k);
	}
}