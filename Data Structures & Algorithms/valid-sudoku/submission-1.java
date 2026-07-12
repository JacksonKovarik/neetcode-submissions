class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create a HashMap for rows, columns, and squares
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> sqs = new HashMap<>();

        for(int i=0; i<board.length; i++){
            rows.put(i, new HashSet<>());
            for(int j=0; j<board[i].length; j++){
                char curr = board[i][j];
                String sqr = "" + (i/3) + (j/3);

                cols.putIfAbsent(j, new HashSet<>());
                sqs.putIfAbsent(sqr, new HashSet<>());

                if(curr != '.'){
                    // System.out.println(curr + " " + sqr);
                    if(rows.get(i).contains(curr) || cols.get(j).contains(curr) || sqs.get(sqr).contains(curr)){
                        return false;
                    }
                    rows.get(i).add(curr);
                    cols.get(j).add(curr);
                    sqs.get(sqr).add(curr);
                }
            }
        }
        System.out.println(sqs.get("00"));

        
        return true;
    }
}
