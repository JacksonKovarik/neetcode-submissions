class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;

        while (p1 <= p2) {
            int sum = numbers[p1] + numbers[p2];
            int res = sum == target ? 0 : (sum < target ? -1 : 1);
            switch (res) {
                case -1:
                    p1++;
                    break;
                case 1:
                    p2--;
                    break;
                default:
                    return new int[]{p1+1, p2+1};
            }
        }

        return new int[]{};
    }
}
