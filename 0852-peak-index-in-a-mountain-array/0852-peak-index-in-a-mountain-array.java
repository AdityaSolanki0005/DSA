class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    while(start <= end){
        int mid = (int) start + (end - start) / 2;
        if(arr[mid] > arr[mid + 1]){
            if(arr[mid - 1] < arr[mid]){
                return mid;
            }
            else{
                end = mid;
            }
        }
        else{
            start = mid + 1;
        }
    }
    return -1;
        
    }
}