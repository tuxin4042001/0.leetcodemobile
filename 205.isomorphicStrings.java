//Answer
bool isIsomorphic(string s, string t) {
        int m1[256]={0}, m2[256]={0};
        int count = 1;
        for(int i=0; i<s.length(); i++) {
            if(m1[s[i]]!=m2[t[i]]) return false;
            if(m1[s[i]]==0) {
                m1[s[i]]=count;
                m2[t[i]]=count;
                count++;
            }
        }
        return true;
    }

//My solution
bool isIsomorphic(string s, string t){
	int[] asc1 = new int[256];
	int[] asc2 = new int[256];
	int count = 1;
	for(int i = 0; i < s.length(); i++){
		if(asc1[(int)(s.charAt(i))] != asc2[(int)(t.charAt(i))]){
			return false;
        }
        count++;
        asc1[(int)(s.charAt(i))] = count;
        asc2[(int)(t.charAt(i))] = count;
    }
    retuen true;
}