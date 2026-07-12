class Solution {
    public int longestConsecutive(int[] nums) {
        // Create set for all of the numbers within the list
        // When adding a numebr to the set, check for the number 1 less
            // IF found, max += 1
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currMax = 1;
                while(set.contains(num+1)){
                    currMax++;
                    num++;
                }
                max = Math.max(max, currMax);
            }
        }
        return max;
    }
}
