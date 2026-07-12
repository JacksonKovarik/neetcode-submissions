class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<Integer>();

        for(int i:nums){
            unique.add(i);
        }
        if(unique.size() < nums.length){
            return true;
        }

        return false;
    }
}
