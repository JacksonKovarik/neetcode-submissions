class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(String st : strs){
            s += st.length() + "#" + st;
        }

        return s;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;int j=0;
        while(i < str.length()){
            String num = "";
            String re = "";
            while(str.charAt(j) != '#' && j<str.length()){
                num += str.charAt(j);
                j += 1;
            }
            
            int len = Integer.parseInt(num);
            j++;
            int val = j+len;
            while(j < val){
                re += str.charAt(j);
                j++;
            }
            System.out.println(j);
            res.add(re);
            i=j;
        }
        return res;
    }
}
