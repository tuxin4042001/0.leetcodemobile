//Answer
public class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*pow(x*x, n/2);
    }
}

//My solution
package _50_powXN;

public class myPow {
	//方法一： 采用迭代法求解myPow, 关键得区分几个情况
	//      a. x == 0 的情况, x == 0 && n < 0 有影响, 此时结果应该为Integer.Max_VALUE;
	//      b. n == 0, 任何情况下 n == 0 结果为1;
	//      c. n < 0, x = 1/x, 对换一下位置;
	//      d. pow(x, n) 采用二分法求解, x * x = x ^ 2, x ^ 2 * x ^ 2 = x ^ 4, x ^ 4 * x ^ 4 = x ^ 8...., 这样的话就会很快逼近x ^ n
	//      return (n % 2 == 0)? myPow(x * x, n/2) : x * myPow(x * x, n/2);
	//      return sum * myPow(x, n - multiple);
    public double myPow(double x, int n) {
        
    	if(x == 0 && n < 0){
    		return Integer.MAX_VALUE;
    	}
        if(n == 0) return 1;
        if(n < 0){
            if(n == -2147483648){
                n = -2147483646;
            }
            n = -n;
        	x = 1/x;
        }
        
        return (n % 2 == 0)? myPow(x * x, n/2) : x * myPow(x * x, n/2);
    }
    
    public double myPow2(double x, int n) {
        if(x == 0 && n < 0){
        	return Integer.MAX_VALUE;
        }
        if(n == 0) return 1;
        if(n < 0){
            if(n == -2147483648){
                n = -2147483646;
            }
            n = -n;
        	x = 1/x;
        }
        
        double sum = x;
        int multiple = 1;
        while(multiple + multiple < n){
        	sum = sum * sum;
        	multiple = multiple + multiple;
        }
        return sum * myPow(x, n - multiple);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = Math.pow(0, -1);
		System.out.println(i);

	}

}
