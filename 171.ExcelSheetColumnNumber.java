//Answer
public int titleToNumber(String s) {
    int result = 0;
    for(int i = 0 ; i < s.length(); i++) {
      result = result * 26 + (s.charAt(i) - 'A' + 1);
    }
    return result;
  }
 
//My solution
public int titleToNumber(String s){
	int result = 0;
	StringBuilder str = new StringBuilder("s");
	str.reverse();
	for(int i = str.length() - 1; i >= 0; i--){
		result = result + ((int)(str.charAt(i) - 'A') + 1)*(Math.pow(26,i));
    }
    return result;
}

