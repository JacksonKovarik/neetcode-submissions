class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCounter=0, prod=1;

        for(int i : nums){
            if(i == 0){
                zeroCounter++;
            }else{
                prod *= i;
            }
        }
        if(zeroCounter > 1){
            return new int[nums.length];
        }
        for(int i=0; i<nums.length; i++){
            if(zeroCounter == 1){
                nums[i] = nums[i] == 0 ? prod : 0;
            }else{
                nums[i] = prod/nums[i];
            }
        }
        return nums;
    }
}  
