class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i != 0){
                if(nums[i] == nums[i-1]){
                    continue;
                }
            }
            int diff = nums[i]*-1;
            int l=i+1, r=nums.length-1;
            while(l<r){
                int sum = nums[l] + nums[r];
                if(sum == diff){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    res.add(ans);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }else if(sum > diff){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
