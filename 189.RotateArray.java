//Answer
public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}

//My solution
public void rotate(int[] nums, int k){
	nums = rotate(nums, k);
}

public int[] rotate(int[] nums, int k){
	int[] result = new int[nums.length];
	for(int i = 0; i < k; i++){
		result[i] = nums[nums.length - k + i];
    }
    for(int i = 0; i < nums.length - k; i++){
    	result[k + i] = nums[i];
    }
    return result;
}