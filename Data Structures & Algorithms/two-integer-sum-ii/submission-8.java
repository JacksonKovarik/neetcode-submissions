class Solution {
    public int[] twoSum(int[] n, int target) {
        // int l=0, r=n.length-1;
        // while(l<r){
        //     int sum = n[l] + n[r];
        //     if(sum == target){
        //         return new int[]{l+1, r+1};
        //     }else if(sum > target){
        //         r--;
        //     }else{
        //         l++;
        //     }
        // }
        // return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n.length; i++){
            int diff = target - n[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff)+1, i+1};
            }else{
                map.put(n[i], i);
            }
        }
        return new int[]{};
    }
}
