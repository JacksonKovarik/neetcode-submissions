class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> ss = new HashMap<>();
        Map<Character, Integer> tt = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            int countS = ss.getOrDefault(s.charAt(i), 0)+1;
            ss.put(s.charAt(i), countS);

            int countT = tt.getOrDefault(t.charAt(i), 0)+1;
            tt.put(t.charAt(i), countT);
        }

        return ss.equals(tt);
    }
}
