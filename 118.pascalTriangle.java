//Answer
//关键一:要知道本题使用二维动态数组List<List<Integer>>求解;
//关键二:row.add(0, 1); list至少需要添加头元素;
//关键三:row.set(j, row.get(j)+row.get(j+1)); row.set可以将之前的元素向后挤
public List<List<Integer>> generate(int numRows)
{
	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	ArrayList<Integer> row = new ArrayList<Integer>();
	for(int i=0;i<numRows;i++)
	{
		row.add(0, 1);
		for(int j=1;j<row.size()-1;j++)
			row.set(j, row.get(j)+row.get(j+1));
		allrows.add(new ArrayList<Integer>(row));
	}
	return allrows;
	
}

//My solution
package _118_pascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generate {
	//解法一： 关键是要了解杨辉三角的规律
	//      a. numRows决定了每一行的长度, 例如第一行一个元素, 第二行2个元素, 第三行3个元素, ......
	//      b. 去头去尾, 中间的元素j等于上一行两个元素和, tempList.set(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
	//      c. 使用list.set之前需要在list.add添加一个元素, 不然list为空, set不了元素
	//      d. list.add(new ArrayList<Integer>(tempList);标准写法
    public static List<List<Integer>> generate(int numRows) { 
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0){
        	return list;
        }
        Integer[] data = {1};
        list.add(Arrays.asList(data));
        if(numRows == 1){
        	return list;
        }
        Integer[] data1 = {1, 1};
        list.add(Arrays.asList(data1));
        if(numRows == 2){
        	return list;
        }
        int index = 3;
        while(index <= numRows){
        	List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(1);
            for(int i = 1; i < index - 1; i++){
            	int digit = list.get(index - 2).get(i - 1) + list.get(index - 2).get(i);
                tempList.add(i, digit);
            }
            tempList.add(1);
            list.add(tempList);
        }
        return list;
    }
    
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
        	if(i <= 1){
        		tempList.add(0, 1);
        		tempList.set(i, 1);
        		list.add(new ArrayList<Integer>(tempList));
        	}else{
        		tempList.add(0, 1);
        		tempList.set(i, 1);
        		for(int j = 1; j < i; j++){
        			tempList.set(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
        		}
        		list.add(new ArrayList<Integer>(tempList));
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		generate(numRows);

	}

}

