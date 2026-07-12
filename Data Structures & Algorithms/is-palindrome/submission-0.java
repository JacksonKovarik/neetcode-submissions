class Solution {
    public boolean isPalindrome(String s) {
        String alphanumericStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int p1 = 0;
        int p2 = alphanumericStr.length()-1;
        
        while(p1 < p2) {
            if(alphanumericStr.charAt(p1) == alphanumericStr.charAt(p2)) {
                p1++;
                p2--;
                continue;
            } else {
                System.out.println(alphanumericStr.charAt(p1) + " " + alphanumericStr.charAt(p2));
                return false;
            }
        }
        return true;
    }
}
