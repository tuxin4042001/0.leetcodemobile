public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}

public String addBinary(String a, String b){
	int i = Integer.parseInt(a, 2);
	int j = Integer.parseInt(b,2);
	String str = Integer.toString(i + j , 2);
	return str;
}

public String addBinary(String a, String b){
	StringBuilder str = new StringBuilder();
	int a_index = a.length() - 1;
	int b_index = b.length() - 1;
	int carry = 0;
	int sum = 0;
	while(i >= 0 || j >= 0){
		sum = carry;
		if(a_index >= 0 )sum = sum + a.charAt(a_index--) - '0';
		if(b_index >= 0 )sum = sum + b.charAt(b_index--) - '0';
		carry = sum/2;
		sum = sum%2;
		str.append(sum);
    }
    if(carry != 0) str.append(carry);
    str.reverse();
    return str.toString();
    
}