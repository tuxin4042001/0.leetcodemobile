//Answer
public class Solution {

public String longestPalindrome(String s) {
	String sub = "";
	if(s.length()==1||s==null){
		return s;
	}
	if(s.length()==2){
		if(s.charAt(0)==s.charAt(1)){
			return s;
		}else {
			return s.substring(1);
		}
	}
    for(int i=2;i<s.length();i++){      	
    	if(s.charAt(i)==s.charAt(i-2)){
        	int j, k;
        	for(j=i-2, k=i;j>=0&&k<s.length();j--, k++){
        		if(s.charAt(j)!=s.charAt(k)){
        			break;
        		}
        	}
        	if(sub.length()<s.substring(j+1, k-1).length()){
        		if(k-1==s.length()-1){
        			sub=s.substring(j+1);
        		}else {
        			sub=s.substring(j+1, k-1);
				}
        			
        	}       		
        }        		
    	
    }
    for(int i=1;i<s.length();i++){
    	if(s.charAt(i)==s.charAt(i-1)){
    		int j, k;
    		for(j=i-1, k=i;j>=0&&k<s.length();j--, k++){
    			if(s.charAt(j)!=s.charAt(k)){
    				break;
    			}
    		}
    		if(sub.length()<s.substring(j+1, k-1).length()){
    			if(k-1==s.length()-1){
    				sub=s.substring(j+1);
    			}else {
    				sub=s.substring(j+1, k-1);
    			}
    		}
    	}
    	
    }
    return sub;
}