public int lengthOfLastWord(String s) {
    int len=s.length(), lastLength=0;
    
    while(len > 0 && s.charAt(len-1)==' '){
        len--;
    }
    
    while(len > 0 && s.charAt(len-1)!=' '){
        lastLength++;
        len--;
    }
    
    return lastLength;
}

public int lengthOfLastWord(String s){
	int count = 0;
	int index = s.length();
	if(s = ""){
		return 0;
    }
    while(index > 0 && s.charAt(index) == ' '){
    	index--;
    }
    while(index > 0 && s.charAt(index) != ' '){
    	index--;
        count++;
    }
    return count;
}