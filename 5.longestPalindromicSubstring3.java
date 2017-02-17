//My solution
//????: 1. ??????????????palindrome
//                  2.??lo maxlen????str = s.substring(j + 1, k)
Public String longestPalindrome(String s){
	if(s.length() < 2){
		return s;
    }
    
    int sub = ""
    int lo = 0; maxlen = 0;
    for(int i = 0; i < s.length() -1; i++){
    	int j = i, k = i;
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
        	j--;
            k++;
        }
        if(maxlen < k - j - 1){
        	lo = j + 1;
        	maxlen = k - j - 1;
        }
        
        int j = i, k = i+1;
        for(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
        	j--;
            k++;
        }
        if(maxlen < k - j - 1){
        	lo = j + 1;
            maxlen = k - j - 1;
        }
    }
    return sub = s.substring(lo, lo + maxlen);
}