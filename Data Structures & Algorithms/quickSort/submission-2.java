// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        // Pick pivot
        // Seperate values smaller to the left and vice versa
            // Have a placement pointer
            // Have a pointer to go through values comparing with pivot
        return quickSortHelper(pairs, 0, pairs.size()-1);
    }
    public List<Pair> quickSortHelper(List<Pair> pairs, int s, int e){
        if(e-s+1 <= 1) {
            return pairs;
        }

        Pair pivot = pairs.get(e);

        int placer = s;
        
        for(int i=s; i<e; i++) {
            if(pairs.get(i).key < pivot.key){
                Pair tmp = pairs.get(placer);
                pairs.set(placer, pairs.get(i));
                pairs.set(i, tmp);
                placer++;
            }
        }

        pairs.set(e, pairs.get(placer));
        pairs.set(placer, pivot);

        quickSortHelper(pairs, s, placer-1);
        quickSortHelper(pairs, placer+1, e);

        return pairs;
    }
}
