class Solution {
    public int[] twoSum(int[] nums, int target) {
        // TARGET: [index1+1, index2+1] ==> nums[index1]+nums[index2] == target
        // GIVEN: Sorted array + target sum
        // STRATEGY: Point to left and right of nums and test the values in accordance to target
            // HOW: IF nums[right] < target 
                //  OR nums[left] > target     ==>.   return -1 (not possible)
            // ELSE IF: nums[right] - nums[left] < target:
                // Move left up 1 spot
            // ELSE IF: nums[right] - nums[left] > target: 
                // Move right down 1 spot
            // ELSE: return [left+1, right+1]
        int[] ans = new int[2];
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if (nums[right] + nums[left] < target){
                left++;
            }else if (nums[right] + nums[left] > target) {
                right--;
            }else{
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
        }
        return ans;
    }
}
