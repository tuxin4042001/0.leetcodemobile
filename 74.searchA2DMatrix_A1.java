public boolean searchMatrix(int[][] matrix, int target){
	int m = matrix.length;
	int n = matrix[0].length;
	int rowIndex, colIndex;
	while(rowIndex < m){
		if(target < matrix[rowIndex][0]){
			break;
        }
        rowIndex++;
    }
    if(rowIndex == 0){
    	return false;
    }else{
    	int start = 0, end = n - 1;
        while(start < end){
        	int mid = (start + end)/2;
            if(matrix[rowIndex - 1][mid] < target){
            	start = mid + 1;
            }else{
            	end = mid;
            }
        }
        if(matrix[rowIndex][start] != target){
        	return false;
        }else{
        	return true;
        }
    }
}

public boolean searchMatrix(int[][] matrix, int target){
	int m = matrix.length;
	int n = matrix[0].length;
	int start = 0, end = m*n - 1;
	while(start < end){
		int mid = (start + end)/2;
		if(matrix[mid / n][mid % n] < target){
			start = mid + 1;
        }else{
        	end = mid;
        }
    }
    if(matrix[start / n][start % n] != target){
    	return false;
    }else{
    	return true;
    }
}
