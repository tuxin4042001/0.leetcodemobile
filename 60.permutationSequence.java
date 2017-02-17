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
	//�ⷨһ: �ؼ����˽⵽permutation���������
	//      �� n = 3Ϊ��, 1 2 3, 1 3 2, 2 1 3, 2 3 1, 3 1 2, 3 2 1
	//      1 --> 2֮���� 2!������ 1 2 3, 1 3 2, 2 1 3
	//      ���k = 3, 3 / 2! = 1, ˵�� k = 3, ��һ���ַ�һ��Ϊ 2
	//      a. ���� list ����� 1 - n ����ֵ, ÿ�ҵ�һ����ɾ��һ��, list���Ǳ��ִ�С����˳��
	//      b. ����factorial�������factorial����, ֪��������factorial
	//      c. ֪����θ���kֵ��(n - 1)!��index, �ҵ�ÿһ��digit
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
