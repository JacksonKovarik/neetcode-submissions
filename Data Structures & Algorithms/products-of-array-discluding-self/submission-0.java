class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero = 0;
        for(int i : nums){
            if(i == 0){
                zero++;
                continue;
            }
            prod *= i;
        }
        
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(zero > 1){
                output[i] = 0;
            }else if(zero == 1){
                output[i] = nums[i] == 0 ? prod : 0;
            }else{
                output[i] = prod / nums[i];
            }
        }

        return output;
    }
}  
