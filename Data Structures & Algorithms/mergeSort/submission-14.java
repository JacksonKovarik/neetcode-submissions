// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mHelp(pairs, 0, pairs.size()-1);
    }

    public List<Pair> mHelp(List<Pair> pairs, int s, int e){
        if(s >= e){
            return pairs;
        }

        int m = (e+s) / 2;

        mHelp(pairs, s, m);
        mHelp(pairs, m+1, e);

        merge(pairs, s, m, e);

        return pairs;
    }

    public List<Pair> merge(List<Pair> pairs, int s, int m, int e){
        List<Pair> l = new ArrayList<>();
        List<Pair> r = new ArrayList<>();

        for(int i=s; i<m+1; i++){
            l.add(pairs.get(i));
        }
        for(int i=m+1; i<e+1; i++){
            r.add(pairs.get(i));
        }

        int p=s, L=0, R=0;

        while(L < l.size() && R < r.size()){
            if(l.get(L).key <= r.get(R).key){
                pairs.set(p, l.get(L));
                L++;
            }else{
                pairs.set(p, r.get(R));
                R++;
            }
            p++;
        }

        while(L < l.size()){
            pairs.set(p, l.get(L));
            L++;
            p++;
        }
        while(R < r.size()){
            pairs.set(p, r.get(R));
            R++;
            p++;
        }
        return pairs;
    }
}
