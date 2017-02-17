public boolean isValidSudoku(char[][] board) {
    for(int i = 0; i<9; i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        for (int j = 0; j < 9;j++){
            if(board[i][j]!='.' && !rows.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !columns.add(board[j][i]))
                return false;
            int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && 
                !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                return false;
        }
    }
    return true;
}

public boolean isValidSudoku(char[][] board){
	for(int i = 0; i < 9; i++){
		Hashset rows = new Hashset();
		Hashset cols = new Hashset();
		Hashset cubes = new Hashset();
		for(int j = 0; j < 9; j++){
			if(board[i][j] !=  '.' && !rows.add(board[i][j]){
				return false;
            }
            if(board[j][i] != '.' && !cols.add(board[j][i]){
            	return false;
            }
            int cube_rowIndex = 3*(i/3) + j/3;
            int cube_colIndex = 3*(i%3) + j%3;
            if(board[cube_rowIndex][cube_colIndex] != '.' &&
                !cube.add(board[cube_rowIndex][cube_colIndex]){
                	return false;
            }
        }
    }
    return true;
}