//My solution
public void nextPemutation(int[] nums){
	if(nums.length < 2){
		return;
    }
    int index = nums.length;
    while(index > 0){
    	if(nums[index] > nums[index - 1]){
            break;
        }
        index--; // find the specific index with nums[index] > nums[index - 1]
    }
    if(index == 0){
    	reverseSort(nums, 0, nums.length - 1);
        return;
    }else{
    	int minIndex = findMinIndex(nums, index, nums.length - 1);
    }
}