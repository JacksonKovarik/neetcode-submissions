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
    public List<Pair> mergeSortHelper(List<Pair> pairs, int s, int e){
        if(s < e){
            // Find the middle value
            int m = (e+s)/2;
            // Sort both sides recursively 
            mergeSortHelper(pairs, s, m);
            mergeSortHelper(pairs, m+1, e);

            // Merge both sides 
            merge(pairs, s, m, e);
        }
        return pairs;
    }

    public List<Pair> merge(List<Pair> pairs, int s, int m, int e){
        // Split pairs into 2
        List<Pair> left = new ArrayList<>();
        List<Pair> right = new ArrayList<>();

        for(int i=s; i<m+1; i++){
            left.add(pairs.get(i));
        }
        for(int i=m+1; i<e+1; i++){
            right.add(pairs.get(i));
        }

        // Created pointers to identify elemensts in each list
        int L = 0; // left pointer
        int R = 0; // right pointer
        int P = s; // Pointer for pairs

        // Merge into pairs
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
}
