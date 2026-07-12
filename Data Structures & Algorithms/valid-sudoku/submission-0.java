class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet> rows = new HashMap<>();
        HashMap<Integer, HashSet> cols = new HashMap<>();
        HashMap<String, HashSet> squares = new HashMap<>();

        for(int i=0; i<board.length; i++){
            HashSet<Character> setr = new HashSet<>();
            rows.put(i, setr);
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                // Rows
                if(rows.get(i).contains(board[i][j])){
                    return false;
                }
                rows.get(i).add(board[i][j]);

                // Columns
                if(!cols.containsKey(j)){
                    HashSet<Character> setc = new HashSet<>();
                    cols.put(j, setc);
                }else if(cols.get(j).contains(board[i][j])){
                    return false;
                }
                cols.get(j).add(board[i][j]);

                // Squares
                String square = (i/3) + "," + (j/3);
                if(!squares.containsKey(square)){
                    HashSet<Character> sets = new HashSet<>();
                    // sets.add(board[i][j]);
                    squares.put(square, sets);
                }else if(squares.get(square).contains(board[i][j])){
                    return false;
                }
                squares.get(square).add(board[i][j]);
                
            }
        }
   
        return true;
    }
}
