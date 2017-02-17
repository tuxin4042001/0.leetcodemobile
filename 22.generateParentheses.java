//Answer
 public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int max){
        
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
    
//My solution
//Use recursion to realize auto generate

public List<String> generateParentheses(int n){
	List<String> res = new List<String>();
	autoGenerate(list, "", 0, 0, n);
	return res;
}

public void autoGenerate(List<String> res, String str, int open, int close, int max){
	if(str.length() == max*2){
		res.add(str);
		return; //when str.length() == max*2, add it to List<String> res and stop
    }
    
    if(open < max){
    	str = str + '(';
        autoGenerate(res, str, open + 1, close, max);
    }
    
    if(close < open){
    	str = str + ')';
        autoGenerate(res, str, open, close + 1, max);
    }
}