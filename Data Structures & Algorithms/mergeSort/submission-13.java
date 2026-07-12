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
        return mergeHelper(pairs, 0, pairs.size()-1);
    }

    public List<Pair> mergeHelper(List<Pair> pairs, int s, int e){
        if(s>=e){
            return pairs;
        }

        int m = (s+e)/2;

        mergeHelper(pairs, s, m);
        mergeHelper(pairs, m+1, e);

        merge(pairs, s, m, e);

        return pairs;
    }

    public List<Pair> merge(List<Pair> pairs, int s, int m, int e){
        List<Pair> left = new ArrayList<>();
        for(int i=s; i<m+1; i++){
            left.add(pairs.get(i));
        }
        List<Pair> right = new ArrayList<>();
        for(int i=m+1; i<e+1; i++){
            right.add(pairs.get(i));
        }

        int L = 0, R = 0, P = s;

        while(L<left.size() && R<right.size()){
            if(left.get(L).key <= right.get(R).key){
                pairs.set(P, left.get(L));
                L++;
            }else{
                pairs.set(P, right.get(R));
                R++;
            }
            P++;
        }

        while(L<left.size()){
            pairs.set(P, left.get(L));
            L++;
            P++;
        }
        while(R<right.size()){
            pairs.set(P, right.get(R));
            R++;
            P++;
        }

        return pairs;
    }

    public void print(List<Pair> pairs){
        for(int i=0; i<pairs.size(); i++){
            System.out.print(pairs.get(i).key + " ");
        }
        System.out.println();
    }
}
