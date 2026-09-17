class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {

            while (left < right && !this.isAlpha(s.charAt(left))) {
                left++;
            } 
            while (left < right && !this.isAlpha(s.charAt(right))) {
                right--;
            } 

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        
        }

        return true;
    }

    public boolean isAlpha(char c){
        return (c <= 'z' && c >= 'a') 
            || (c <= 'Z' && c >= 'A')
            || Character.isDigit(c);
    }
}
