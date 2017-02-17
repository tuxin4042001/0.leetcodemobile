//Answer
public class Solution {
public String convertToTitle(int n) {
    String res = "";
    while(n != 0) {
        char ch = (char)((n - 1) % 26 + 65);
        n = (n - 1) / 26;
        res = ch + res;
    }
    return res;
}
}

//My solution
public String convertToTitle(int n){
	StringBuilder result = new StringBuilder("");
	while(n != 0){
		result.append((char)((n - 1)%26 + 65);
		n /= 26;
    }
    return result.reverse().toString();
}