//Answer
    public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}

//My Solution
Keypoint:
a. cannot use multiple for-loop to solve this problem, because you don't know 
    how many for-loop you will use in the process, it is a dynamic process. 
b. In this situation, it is better to consider to use dynamic LinkedList to solve this 
    this problem. 
    while(ans.peek().length() == i){
    	String temp == ans.remove();
    }
    for(char c : mapping[index]){
    	ans.add(temp + c);
    }
c. ????????????

public List<String> letterCombinations(String digits){
	LinkedList<String> ans = new LinkedList<String>();
	String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	ans.add("");
	for(int i = 0; i < digits.length(); i++){
		//there are two methods to change character to int
		//1. char c = (int)(digis.charAt(i) - '0')
		//2. char c = Character.getNumericValue(digits.charAt(i));
		int index = Character.getNumericValue(digits.charAt(i));
	    while(ans.peek().length() == i){
		    String temp = ans.remove();
		    for(char c : mapping[index]){
			    ans.add(temp + c);
            }
        }
    }
    return ans;
}