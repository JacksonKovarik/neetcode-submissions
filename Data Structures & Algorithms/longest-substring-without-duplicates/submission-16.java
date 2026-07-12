class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int R, L=0;
        int len=0, maxLen=0;
        for(R=0; R<s.length(); R++){
            // System.out.println(R + " " + s.charAt(R) + " " + L + " " + s.charAt(L) + " " + len);
            if(map.containsKey(s.charAt(R))){
                L = Math.max(map.get(s.charAt(R))+1, L);
            }
            map.put(s.charAt(R), R);
            len = Math.max(len, (R-L)+1);

        }
        return len;
    }
}
