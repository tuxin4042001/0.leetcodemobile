//方法一: 由于matrix的排序是从左到右排序，从上到下排序，所以先找到target
//              应该所在行，然后二分法找target，判断其是否存在;
//              a.扫描matrix，如果matrix[rowIndex][0]， 说明target应该在rowIndex - 1
//                 行;
//              b.在rowIndex - 1行中使用二分法查找target，判断target是否存在;

public boolean searchMatrix(int[][] matrix, int target) {
	    //错误点一: 需要判断matrix为空情况;
    	if(matrix.length == 0 || matrix[0].length == 0)
    		return false;
    	int m = matrix.length;
    	int n = matrix[0].length;
        //错误点二:需要初始化rowIndex;
    	int rowIndex = 0;
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
            //错误点三:需要在rowIndex - 1中找而不是在rowIndex中找;
            if(matrix[rowIndex - 1][start] != target){
            	return false;
            }else{
            	return true;
            }
        }
    }

//方法二: 将二维数组int[][] matrix当做一个一维数组int[] array看待
//              在一维数组array中使用二分法查找是否存在target
//              a. 关键在于如何将二维数组当做一维数组看待
//                   start = 0, end = m * n - 1, mid = (start + end)/2
//                   array[mid] = matrix[mid/n][mid%n]
public boolean searchMatrix2(int[][] matrix, int target){
    	if(matrix.length == 0 || matrix[0].length == 0){
    		return false;
    	}
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