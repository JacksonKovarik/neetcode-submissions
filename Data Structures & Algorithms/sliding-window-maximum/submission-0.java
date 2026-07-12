class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> window = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        // int L=0;
        for(int R=0; R<nums.length; R++){
            if(R<k-1){
                window.add(nums[R]);
            }else{
                window.add(nums[R]);
                // System.out.println(window);
                max.add(findMax(window));
                window.remove(0);
                // window.add(nums[R]);
                // L++;
            }
        }
        int[] ans = new int[max.size()];
        for(int i=0; i<max.size(); i++){
            ans[i] = max.get(i);
        }
        return ans;
        
    }

    public int findMax(List<Integer> nums){
        int max = nums.get(0);
        for(int i : nums){
            max = Math.max(max, i);
        }
        return max;
    }
}
