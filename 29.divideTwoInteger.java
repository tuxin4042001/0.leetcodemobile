//Answer
 public int divide(int dividend, int divisor) {
	//Reduce the problem to positive long integer to make it easier.
	//Use long to avoid integer overflow cases.
	int sign = 1;
	if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
		sign = -1;
	long ldividend = Math.abs((long) dividend);
	long ldivisor = Math.abs((long) divisor);
	
	//Take care the edge cases.
	if (ldivisor == 0) return Integer.MAX_VALUE;
	if ((ldividend == 0) || (ldividend < ldivisor))	return 0;
	
	long lans = ldivide(ldividend, ldivisor);
	
	int ans;
	if (lans > Integer.MAX_VALUE){ //Handle overflow.
		ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
	} else {
		ans = (int) (sign * lans);
	}
	return ans;
}
.
private long ldivide(long ldividend, long ldivisor) {
	// Recursion exit condition
	if (ldividend < ldivisor) return 0;
	
	//  Find the largest multiple so that (divisor * multiple <= dividend), 
	//  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
	//  Think this as a binary search.
	long sum = ldivisor;
	long multiple = 1;
	while ((sum+sum) <= ldividend) {
		sum += sum;
		multiple += multiple;
	}
	//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
	return multiple + ldivide(ldividend - sum, ldivisor);
}

//My Solution
package _29_divideTwoInteger;

import _14_longestCommonPrefix.longestCommonPrefix;

public class divide2 {
	//解法一:关键点就是利用 sum + sum = 2*sum, multiple + multiple = 2*multiple, 加法模拟乘法去逼近dividend
	//     a. 本题需要考虑符号, 引入sign
	//     b. 本题会出现溢出的情况, 如果想正确计算除法, 需要将 dividend => ldividend, divisor => ldivisor
	//     c. 考虑到ldivisor == 0情况, ldividend == 0情况
	//     d. 利用sum + sum = 2*sum, multiple + multiple = 2*multiple, 加法模拟乘法去逼近dividend, 求解除法
    public static int divide(int dividend, int divisor) {
        int sign = 1;
        if(dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0){
        	sign = -1;
        }
        
        long ldivisor = Math.abs((long)divisor);       
        long ldividend = Math.abs((long)dividend);
       
        if(ldivisor == 0) return Integer.MAX_VALUE;
        if(ldividend == 0) return 0;
        
        long lans = ldivide(ldividend, ldivisor);
        int ans;
        if(lans >= Integer.MAX_VALUE){
        	ans = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }else{
        	ans = (sign == 1) ? (int)lans : -(int)lans;
        }
        return ans;
    }
    
    public static long ldivide(long ldividend, long ldivisor){
    	if(ldividend < ldivisor){
    		return 0;
    	}
    	
    	long sum = ldivisor;
    	int multiple = 1;
    	while((sum + sum) < ldividend){
    		sum += sum;
    		multiple += multiple;
    	}
    	return multiple + ldivide(ldividend - sum, ldivisor);
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = -2147483648;
		int j = -1;
		divide(i, j);

	}

}
