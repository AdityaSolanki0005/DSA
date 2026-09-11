class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = 0;
        while(start <= end){
            int mid = (int) start + (end - start) / 2;
            if(mid == nums.length - 1){
                peak = mid;
                break;
            }
            if(nums[mid] > nums[mid + 1]){
                peak = mid;
                break;
            }
            else{
                if(nums[mid] >= nums[start]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        start = 0;
        end = nums.length - 1;
        if(target >= nums[start]){
            end = peak;
        }
        else{
            start = peak + 1;
        }
        while(start <= end){
            int mid = (int) start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else{
                if(nums[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            
        }
    
    return -1;
        
    }
}