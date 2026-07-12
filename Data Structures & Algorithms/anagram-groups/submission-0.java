class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            // Create an array to sort of the chars
            char[] charArr = s.toCharArray();
            // Sort char array
            Arrays.sort(charArr);
            // Make sorted array into string
            String sortedS = new String(charArr);
            // Add to HashMap if absent
            res.putIfAbsent(sortedS, new ArrayList<>());
            // Add original String to HashMap
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
