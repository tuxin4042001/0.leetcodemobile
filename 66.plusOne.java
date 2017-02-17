//Answer
public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}

//My Solution
package _66_plusOne;

public class plusOne {
	//�ⷨһ: ��������һ�� carry ���������λ
	//      a. �ؼ����ڴ��� 9, 99, 999 ��ֵ
	//         9 => 10, 99 => 100
	//         ������� carry == 1, ���ж��Ƿ� digits.length + 1 && digits[0] = 1
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
        	digits[i] += carry;
        	if(digits[i] == 10){
        		digits[i] = 0;
        		carry = 1;
        	}else{
        		carry = 0;
        		break;
        	}
        }
        if(carry == 1){
        	digits = new int[digits.length + 1];
        	digits[0] = 1;
        }
        return digits;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
