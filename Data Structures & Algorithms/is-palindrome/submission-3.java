class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (!this.isAlpha(s.charAt(left))) {
                left++;
            } else if (!this.isAlpha(s.charAt(right))) {
                right--;
            } else {
                if (s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)) return false;
                left++;
                right--;
            }
        }

        return true;
    }

    public boolean isAlpha(char c){
        return (c <= 'z' && c >= 'a') 
            || (c <= 'Z' && c >= 'A')
            || Character.isDigit(c);
    }
}
