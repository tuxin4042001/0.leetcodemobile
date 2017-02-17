//Mysolution
public int myAtoi(String str){
	int index = 0;
	int sign = 0;
	int result = 0;
	if(str == null) return 0;
	
	while(str.charAt(index) == " " && index < str.length()){
		index++;
    }
    
    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
    	sign = (str.charAt(index) == '+')? 1 : -1;
        index++;
    }
    
    while(index < str.length()){
    	int digit = (int)(str.charAt(index) - '0');
        if(digit < 0 || digit > 9) break;
        
        if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > Integer.MAXVALUE % 10){
        	result = Integer.MAX_VALUE * sign;
        }else{
        	result = result * 10 + digit;
            index++;
        }
        
        return result;
    }
}