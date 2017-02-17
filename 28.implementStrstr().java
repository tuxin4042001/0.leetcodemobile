// method 1, consider to use java String API, String.indexOf(String str)
//String.indexOf(String str) return the position of first appearance of substr
public int strStr(String hayStack, String needle){
	return hayStack.indexOf(needle);
}

public int strStr(String hayStack, String needle){
	int index;
	for(int i = 0; i < hayStack.length - needle.length - 1; i++){
		if(hayStack.charAt(i) == needle.charAt(0)){
			int count = 0;
			for(int j = 0; j < needle.length; j++){
				if(hayStack.charAt(i + j ) != needle.charAt(j)){
					break;
                }else{
                	count++;
                }
            }
            if(count == needle.length){
            	return i;
            }
        }
    }
    return -1;
}