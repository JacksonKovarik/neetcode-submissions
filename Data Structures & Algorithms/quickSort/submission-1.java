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
        return quickSortHelper(pairs, 0, pairs.size()-1);
    }
    public List<Pair> quickSortHelper(List<Pair> pairs, int s, int e) {
        // Run function if size > 1
        // Get value to pivot around
        // Start at idx 0 with 2 pointers (left, i)
        // Compare left with pivot
        // if i < pivot swap i and left && left + 1
        // Run recursion on both sides


        if(e-s + 1 <= 1){
            return pairs;
        }

        Pair pivot = pairs.get(e);

        int left = s;
        int i = s;

        while(i < e) {
            if(pairs.get(i).key < pivot.key){
                Pair tmp = pairs.get(left);
                pairs.set(left, pairs.get(i));
                pairs.set(i, tmp);
                left++;
            }
            i++;
        }
        pairs.set(e, pairs.get(left));
        pairs.set(left, pivot);
        

        quickSortHelper(pairs, s, left-1);
        quickSortHelper(pairs, left+1, e);

        return pairs;
    }
}
