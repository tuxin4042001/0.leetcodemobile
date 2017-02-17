
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++)
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
    return pre;
}

//string.substring(start index, end index), ????start index?end index
//???substring
import java.util.*;

 class Dcoder
 { 
	public static void main(String args[])
 	{ 
        String str1 = "abc";
        String str2 = "abg";
        String str3 = "def";
        String str4;
        String str = "abcdef";
        str4 = str.substring(2,4);
        System.out.println(str.indexOf(str3));
        System.out.println(str4);
 	}
 }