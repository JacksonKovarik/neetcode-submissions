// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int len = pairs.size();
        List<List<Pair>> res = new ArrayList<>();
        // res.add(pairs);
        for(int i=0; i<len; i++){
            int j = i - 1;
            while(j >= 0 && pairs.get(j).key > pairs.get(j+1).key){
                Pair tmp = pairs.get(j+1);
                pairs.set(j+1, pairs.get(j));
                pairs.set(j, tmp);
                j--;
            }

            // Clone and save the entire state of the array at this point
            List<Pair> cloneList = new ArrayList<>(pairs);
            res.add(cloneList);
        }
        return res;
    }
}
