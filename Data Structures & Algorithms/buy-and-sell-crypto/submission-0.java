class Solution {
    public int maxProfit(int[] prices) {
        // Keep track of a Left pointer for the minimum value
        // Iterate through the list and if a smaller value is found within the list assign it to left
        // Otherwise, compare the difference to the current max

        int L=0, maxSum=0, currSum=0;

        for(int R=1; R<prices.length; R++){
            if(prices[R] < prices[L]){
                L = R;
            }else{
                currSum = prices[R]-prices[L];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
