public class Solution {
    public String countAndSay(int n) {
	    	StringBuilder curr=new StringBuilder("1");
	    	StringBuilder prev;
	    	int count;
	    	char say;
	        for (int i=1;i<n;i++){
	        	prev=curr;
	 	        curr=new StringBuilder();       
	 	        count=1;
	 	        say=prev.charAt(0);
	 	        
	 	        for (int j=1,len=prev.length();j<len;j++){
	 	        	if (prev.charAt(j)!=say){
	 	        		curr.append(count).append(say);
	 	        		count=1;
	 	        		say=prev.charAt(j);
	 	        	}
	 	        	else count++;
	 	        }
	 	        curr.append(count).append(say);
	        }	       	        
	        return curr.toString();
        
    }
}

public String countAndSay(int n){
	int count;
	Stringbulder curr = "1";
	Stringbuilder prev;
	char say;
	for(int i = 1; i < n; i++){
		prev = curr;
		curr = new Stringbuilder();
		say = prev.charAt(0);
		count = 1;
		for(int j = 1; j < prev.length(); j++){
			if(prev.charAt(j) != say){
				curr.append(count).append(say);
				say = curr.charAt(j);
				count = 1;
            }else{
            	count++;
            }
        }
    }
    return curr.toString();
}