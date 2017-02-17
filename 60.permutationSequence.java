//Answer
public String getPermutation(int n, int k) {
    int pos = 0;
    List<Integer> numbers = new ArrayList<>();
    int[] factorial = new int[n+1];
    StringBuilder sb = new StringBuilder();
    
    // create an array of factorial lookup
    int sum = 1;
    factorial[0] = 1;
    for(int i=1; i<=n; i++){
        sum *= i;
        factorial[i] = sum;
    }
    // factorial[] = {1, 1, 2, 6, 24, ... n!}
    
    // create a list of numbers to get indices
    for(int i=1; i<=n; i++){
        numbers.add(i);
    }
    // numbers = {1, 2, 3, 4}
    
    k--;
    
    for(int i = 1; i <= n; i++){
        int index = k/factorial[n-i];
        sb.append(String.valueOf(numbers.get(index)));
        numbers.remove(index);
        k-=index*factorial[n-i];
    }
    
    return String.valueOf(sb);
}

//My Solution
package _60_permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class getPermutation {
	//解法一: 关键是了解到permutation的排序规律
	//      以 n = 3为例, 1 2 3, 1 3 2, 2 1 3, 2 3 1, 3 1 2, 3 2 1
	//      1 --> 2之间有 2!个排序， 1 2 3, 1 3 2, 2 1 3
	//      如果k = 3, 3 / 2! = 1, 说明 k = 3, 第一个字符一定为 2
	//      a. 设置 list 来添加 1 - n 的数值, 每找到一个就删除一个, list还是保持从小到大顺序
	//      b. 定义factorial数组或者factorial函数, 知道如何求解factorial
	//      c. 知道如何根据k值和(n - 1)!求index, 找到每一个digit
	public static String getPermutation(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int result = 0;
		k--;
		for(int i = 1; i <= n; i++){
			int index = k / factorial(n - i);
			int digit = list.get(index);
			result = result * 10 + digit;
			list.remove(index);
			k = k % factorial(n - i);
		}
		return Integer.toString(result);
	}

	public static int factorial(int n) {
		int result1 = 1;
		while (n > 0) {
			result1 = result1 * n;
			n--;
		}
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getPermutation(1, 1);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));

	}

}
