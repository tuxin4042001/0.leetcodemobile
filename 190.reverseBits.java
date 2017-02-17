//Answer
public int reverseBits(int n) {
    if (n == 0) return 0;
    
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result <<= 1;
        if ((n & 1) == 1) result++;
        n >>= 1;
    }
    return result;
}

//My solution
public int reverseBits(int n){
	int[] array = intToBits(int n);
	Arrays.reverse(array);
	int result = bitsToInt(array);
	return result;
}

public int[] intToBits(int n){
	int index = 0;
	int[] result = new int[10];
	while(n > 0){
		if(n%2 == 0){
			result[index] == 0;
        }else{
        	result[index] == 1;
        }
        n = n/2;
        index++;
    }
    return result;
}

public int bitsToInt(int[] array){
	int result = 0;
	for(int i = 0; i < array.length; i++){
		result = result + array[i]*Math.pow(2,i);
    }
    return result;
}