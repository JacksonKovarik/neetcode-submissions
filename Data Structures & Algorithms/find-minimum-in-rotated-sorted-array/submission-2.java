class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int lowest = nums[0];

        while(left <= right){
            
            int mid = (right+left)/2;
            if(nums[mid]<lowest){
                lowest = nums[mid];
                if(nums[mid-1] > lowest){
                    break;
                }
                right = mid-1;
            }else if(nums[mid] > lowest){
                left = mid+1;
            }else{
                left++;
            }
        }

        return lowest;
    }
}
