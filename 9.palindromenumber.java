//Answer
public boolean isPalindrome(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    return (x==rev || x==rev/10);
}

//My Solution
package _09_palindromeNumber;

public class isPalindrome {
	//方法一: 将int转化为String进行判断
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int start = 0, end = str.length();
        while(start < end){
        	if(str.charAt(start) != str.charAt(end)){
        		return false;
        	}
        	start++;
        	end--;
        }
        return true;
    }
    
    //方法二： 利用Reverse Integer来进行判断, 将int reverse在判断是否和原值相等, 关键在于x < 0, return false
    public static boolean isPalindrome2(int x) {
    	if(x < 0){
    		return false;
    	}
        int result = 0;
        int x1 = x;
        while(x1 != 0){
        	int digit = x1 % 10;
        	int newResult = result * 10 + digit;
        	if((newResult - digit)/10 != result){
        		return false;
        	}
        	result = newResult;
        	x1 = x1 / 10;
        }
        return result == x;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
