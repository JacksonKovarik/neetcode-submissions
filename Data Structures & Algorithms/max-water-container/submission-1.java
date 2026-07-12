class Solution {
    public int maxArea(int[] h) {
        int l=0, r=h.length-1;
        int max = (Math.min(h[l], h[r]) * r);
        while(l<r){
            if(h[l] <= h[r]){
                l++;
            }else{
                r--;
            }
            int min = 
            max = Math.max((Math.min(h[l], h[r]) * (r-l)), max);
        }

        return max;
    }
}
