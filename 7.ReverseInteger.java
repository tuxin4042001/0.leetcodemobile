//Answer
public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}

//My solution
package _07_reverseInteger;

public class reverse {
	//方法一: 方法一和方法二的关键在于懂得如何逐一取int x每位元素
	//       从最高位取: 123 --> 1(123%1000/100) / 2(123%100/10) / 3(123%10/1) 比较复杂
	//       从最低位取: 123 --> 3(123%10) / 2(123/10%10) / 1(123/10/10%10) 比较简单
	//       基本： a. digit = x % 10; 
	//            b. result = result * 10 + digit;
	//            c. x = x / 10;
	//       关键的区别在于如何判断超出Integer.Max_VALUE和Integer.MIN_VALUE
	//       方法一：  if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)
	//              if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE && digit < Integer.MIN_VALUE % 10)
	//       方法二：  if((newResult - digit) / 10 != result)
	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int digit = x % 10;
			if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE && digit < Integer.MIN_VALUE % 10) {
				return 0;
			}

			result = result * 10 + digit;
			x = x / 10;
		}
		return result;
	}
	
    public int reverse2(int x) {
        int result = 0;
        while(x != 0){
        	int digit = x % 10;
        	int newResult = result * 10 + digit;
        	if((newResult - digit) / 10 != result){
        		return 0;
        	}
        	result = newResult;
        	x = x / 10;
        }    
        return result;
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
