//Answer
public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[nRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    
    int i = 0;
    while (i < len) {
        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
}

//My solution
//Keypoint is select the data structure, StringBuilder[] is better than 
//char[][]
public String convert(String s, int nRows){
	int index = 0; // index of String s
	StringBuilder[] str = new StringBuilder[nRows];
	for(int i = 0; i < nRows; i++){
		str[i] = new StringBuilder(""); //initialize StringBuilder Array
    }
	
	//zigzag store the char in String s into StringBuilder array str
	while(index < s.length()){
		//first, vertical store
		for(int i = 0; i < nRows && index < s.length(); i++, index++){
			str[i].append(s.charAt(index));
        }
        //second, zigzag store
        for(int i = nRows - 2; i > 0 && index < s.length(); i--, index++){
        	str[i].append(s.charAt(index));
        }
    }
    
    for(int i = 1; i < nRows; i++){
    	str[0] = str[0].append(str[i]);
    }
    
    return str[0];
}