//Answer
// Keypoint: use HashMap to determine if map contain a specific value
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i + 1;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i + 1);
    }
    return result;
}

//My solution 1
public int[] twoSum(int[] numbers, int target){
	int start = 0;
	int end = numbers.length - 1;
	int[] result = new int[2];
	
	//First, sort the int[] array
	Arrays.sort(numbers);
	//Two pointer, scan the array and find the two sum as well as their index
	while(start < end){
		if(numbers[start] + numbers[end] < target){
			start++;
        }else if(numbers[start] + numbers[end] > target){
        	end--;
        }else{
        	result[0] = start;
            result[1] = end;
        }
    }
    return result;
}

//My solution 2
public int[] twoSum(int[] numbers, int target){
	int[] result = new int[2];
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i = 0; i < numbers.length; i++){
		if(!map.contain(numbers[i])){
			map.put(numbers[i], i);
        }else if{
        	continue;
        }
        if(map.contain(target - numbers[i])){
        	result[0] = i;
            reault[1] = map.get(target - numbers[i]);
        }
    }
    return result;
}