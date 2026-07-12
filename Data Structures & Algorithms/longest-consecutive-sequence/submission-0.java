class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count, maxCount = 0;
        for(int i : nums){
            set.add(i);
        }

        for(int i : nums){
            count = 0;
            if(!set.contains(i-1)){
                while(set.contains(i)){
                    count++;
                    i++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
