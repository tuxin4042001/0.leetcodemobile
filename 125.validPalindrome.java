//Answer
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}

//my solution
public boolean isPalindrome(String s){
	//if s is a empty string, then it is a palindrome
	if(s.isEmpty()){
		return true;
    }
    
    //define two pointer and coresponding character
    int head = 0, tail = s.length() - 1;
    char chead, ctail;
    
    while(head < tail){
    	chead = s.charAt(head);
        ctail = s.charAt(tail);
        if(!Character.isLetterOrDigit(chead)){
        	head++;
        }
        //keypoint: use method Character.isLetterOrDigit() determine if a 
        //char is a letter digit or not, normally I will consider if(char == ',' )
        if(!Charater.isLetterOrDigit(ctail)){
        	tail--;
        }
        if(Character.toLowCase(chead) != Character.toLowCase(ctail)){
        	return false;
        }
        head++;
        tail--;
    }
    retuen true;
}