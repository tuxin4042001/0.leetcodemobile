//Answer
public List<List<Integer>> threeSum(int[] nums){
	Arrays.sort(nums);
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	for(int i = 0; i < nums.length - 2; i++){
		int start = i + 1;
		int end = nums.length - 1;
		//tips 1: ignore the duplicate nums[i]
		if(i == 0 || i > 0 && nums[i] != nums[i - 1]){
		  while(start < end){
			  if(nums[i] + nums[start] + nums[end] == 0){
				  result.add(Arrays.asList(nums[i], nums[start], nums[end]));
				  //tips 2: ignore the duplicate nums[start] and nums[end]
				  while(start < end && nums[start] == nums[start + 1]) start++;
				  while(start < end && nums[end] == nums[end - 1]) end--;
				  start++;
				  end--;
              }
          }
        }
    }
    return result;
}

//My Solution