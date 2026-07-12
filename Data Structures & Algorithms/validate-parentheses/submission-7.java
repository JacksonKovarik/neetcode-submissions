class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        List<Character> p = new ArrayList<>();
        p.add(s.charAt(0));
        for (int i=1; i<s.length(); i++) {
            if(pairs.get(s.charAt(i)) != null && p.size() != 0) {
                if (pairs.get(s.charAt(i)) == p.get(p.size()-1)) {
                    p.remove(p.size()-1);
                } else {
                    return false;
                }
            } else {
                p.add(s.charAt(i));
            }
        }
        return p.size() == 0;
    }
}
