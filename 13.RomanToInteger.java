//Answer
public static int romanToInt(String s) {
	int res = 0;
	for (int i = s.length() - 1; i >= 0; i--) {
		char c = s.charAt(i);
		switch (c) {
		case 'I':
			res += (res >= 5 ? -1 : 1);
			break;
		case 'V':
			res += 5;
			break;
		case 'X':
			res += 10 * (res >= 50 ? -1 : 1);
			break;
		case 'L':
			res += 50;
			break;
		case 'C':
			res += 100 * (res >= 500 ? -1 : 1);
			break;
		case 'D':
			res += 500;
			break;
		case 'M':
			res += 1000;
			break;
		}
	}
	return res;
}

//My solution
//when the roman represent 1,10,100, need to determine it exact value
//for example, case 'I': result += (result > 5) ? 1 : -1;
package _13_romanToInteger;

public class romanToInt {
    public int romanToInt(String s) {
    	int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
        	if(s.charAt(i) == 'I'){
        		if(s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'){
        			result = result - 1;
        		}else{
        			result = result + 1;
        		}
        	}
        	
        	if(s.charAt(i) == 'V'){
        		result = result + 5;
        	}
        	
        	if(s.charAt(i) == 'X'){
        		if(s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'){
        			result = result - 10;
        		}else{
        			result = result + 10;
        		}
        	}
        	
        	if(s.charAt(i) == 'L'){
        		result = result + 50;
        	}
        	
        	if(s.charAt(i) == 'C'){
        		if(s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'){
        			result = result - 100;
        		}else{
        			result = result + 100;
        		}
        	}
        	
        	if(s.charAt(i) == 'D'){
        		result = result + 500;
        	}
        	
        	if(s.charAt(i) == 'M'){
        		result = result + 1000;
        	}
        }
        
        if(s.charAt(s.length() - 1) == 'I') result = result + 1;
        if(s.charAt(s.length() - 1) == 'V') result = result + 5;
        if(s.charAt(s.length() - 1) == 'X') result = result + 10;
        if(s.charAt(s.length() - 1) == 'L') result = result + 50;
        if(s.charAt(s.length() - 1) == 'C') result = result + 100;
        if(s.charAt(s.length() - 1) == 'D') result = result + 500;
        if(s.charAt(s.length() - 1) == 'M') result = result + 1000;
        
        return result;
    }
    
    public static int romanToInt2(String s) {
    	int res = 0;
    	for (int i = s.length() - 1; i >= 0; i--) {
    		char c = s.charAt(i);
    		switch (c) {
    		case 'I':
    			res += (res >= 5 ? -1 : 1);
    			break;
    		case 'V':
    			res += 5;
    			break;
    		case 'X':
    			res += 10 * (res >= 50 ? -1 : 1);
    			break;
    		case 'L':
    			res += 50;
    			break;
    		case 'C':
    			res += 100 * (res >= 500 ? -1 : 1);
    			break;
    		case 'D':
    			res += 500;
    			break;
    		case 'M':
    			res += 1000;
    			break;
    		}
    	}
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
