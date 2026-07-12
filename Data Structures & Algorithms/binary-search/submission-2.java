class Solution {
    public int search(int[] nums, int target) {
        // Given sorted array, search for target
        // Point to front and end and then get the middle value to search by
        // IF mid is less than target, move the left pointer up 
        // IF mid is more than target, move right pointer down
        // ELSE found

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (right+left)/2;
            if(nums[mid] < target) {
                left = mid+1;
            }else if(nums[mid] > target) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
