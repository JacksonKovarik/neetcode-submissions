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
        return mergeSortHelper(pairs, 0, pairs.size()-1);
    }
    public List<Pair> mergeSortHelper(List<Pair> pairs, int s, int e) {
        if(e - s + 1 <= 1){
            return pairs;
        }

        int m = (e+s) / 2;
        System.out.println("S: " + s + " M: " + m + " E: " + e);

        mergeSortHelper(pairs, s, m);
        mergeSortHelper(pairs, m+1, e);

        merge(pairs, s, m, e);

        return pairs;
    }
    public List<Pair> merge(List<Pair> pairs, int s, int m, int e) {
        // Split pairs in half
        // Create pointers for each list
        // Compare left and right and sort into pairs

        List<Pair> left = new ArrayList<>();
        List<Pair> right = new ArrayList<>();

        // Because m is rounded down with integer division, you got to m+1 for the left array limit
        for(int i=s; i<m+1; i++){
            left.add(pairs.get(i));
        }
        // Because m is rounded down with integer division, you got to m+1 for the right array start
        for(int i=m+1; i<e+1; i++){
            right.add(pairs.get(i));
        }

        int L = 0;
        int R = 0;
        int P = s;

        while (L < left.size() && R < right.size()) {
            if(left.get(L).key <= right.get(R).key){
                pairs.set(P, left.get(L));
                L++;
            }else {
                pairs.set(P, right.get(R));
                R++;
            }
            P++;
        }

        while (L<left.size()){
            pairs.set(P, left.get(L));
            L++;
            P++;
        }
        
        while (R<right.size()){
            pairs.set(P, right.get(R));
            R++;
            P++;
        }
        return pairs;
    }

}
