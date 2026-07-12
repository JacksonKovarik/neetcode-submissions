class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        int l=0, r=h.length-1;

        while(l<r){
            int amt = (r-l)*Math.min(h[l], h[r]);
            max = Math.max(max, amt);
            if(h[l] > h[r]){
                r--;
            }else{
                l++;
            }
        }

        return max;
    }
}
