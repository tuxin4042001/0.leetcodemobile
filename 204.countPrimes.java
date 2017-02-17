//Answer
public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}

//My solution
public int countPrimes(int n){
	int count = 0;
	for(int i = 2; i <= n; i++){
		if(i%2 == 0){
			if(i == 2) count++;
			continue;
        }
        if(i%3 == 0){
        	if(i == 3) count++;
            continue;
        }
        if(i%5 == 0){
        	if(i == 5) count++;
            continue;
        }
        if(i%7 == 0){
        	if(i == 7) count++;
            continue;
        }
        count++;
    }
    return count;
}