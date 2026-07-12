class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count=0, maxCount=0;;
        for(int i : nums){
            set.add(i);
        }

        for(int i : nums){
            count = 0;
            while(set.contains(i)){
                count++;
                i -= 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
