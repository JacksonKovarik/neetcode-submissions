class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while (l<r) {
            if (!this.isAlpha(s.charAt(l))) {
                l++;
            } else if (!this.isAlpha(s.charAt(r))) {
                r--;
            } else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }

    public boolean isAlpha(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}
