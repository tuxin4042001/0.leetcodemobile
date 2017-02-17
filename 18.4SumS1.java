//My Solution
//four sum
public List<List<Integer>> fourSum(int[] nums, target){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	//eliminate the situation in which the nums length less than 4
	if(nums.length < 4){
		return res;
    }
    
    Arrays.sort(nums);
    
    //eliminate the situation in which 4*nums[0] > target or 4*nums[nums.length - 1] < target
    if(4*nums[0] > target || 4*nums[nums.length - 1] < target){
    	return res;
    }
    
    //use for-loop, select the element z which may could one of the four elements
    for(int i = 0; i < nums.length - 3; i++){
    	int z = nums[i];
        if(i > 0 && z = nums[i - 1]){
        	continue;
        }
        if(z + 3*nums[nums.length - 1] < target){ //z is too small
        	continue; 
        }
        if(4*z > target){ //z is too big
        	break;
        }
        if(4*z == target){
        	if(i + 3 < nums.length && nums[i + 3]  == z){// z is bountry
        	    res.add(Arrays.asList(z,z,z,z));
            }
            break;
        }
        
        int[] nums1 = Arrays.copyOfRange(nums, i + 1, nums.length);
        List<List<Integer>> res1 = new ArrayList<List<Integer>>();
        res1 = threeSum(nums1, target - z);
        for(int j = 0; j < res1.size(); j++){
        	res1.get(i).add(z);
        }
        res.add(res1);
    }
}

//three sum
public List<List<integer>> threeSum(int[] nums, target){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(nums.length < 3){
		return res;
    }
    
    //Arrays.sort(nums); here we donnot apply sort, because we pass a sorted nums to threeSum function
    
    if(3*nums[0] > target || 3*nums[nums.length - 1] < target){
    	return res;
    }
    
    for(int i = 0; i < nums.length - 2; i++){
    	int z = nums[i];
        if(i > 0 && nums[i] == nums[i - 1]){
        	continue;
        }
        if(z + 2*nums[nums.length - 1] < target){
        	continue;
        }
        if(3*z > target){
        	break;
        }
        if(3*z == target){
        	if(i + 2 < nums.length && nums[i + 2] == z){
        	    res.add(Arrays.asList(z,z,z));
            }
            break;
        }
        int nums1 = Arrays.copyOfRange(nums, i + 1, nums.length);
        List<List<Integer>> res1 = new ArrayList<List<Integer>>();
        res1 = twoSum(nums1, target - z);
        for(int j = 0; j < res1.size(); j++){
        	res1.get(j).add(z);
        }
        res.add(res1);
    }
    return res;
} 

//two sum
public List<List<Integer>> twoSum(int[] nums, target){
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(nums.length < 2){
		return res;
    }
    
    //Arrays.sort(nums);
    
    if(2*nums[0] > target || 2*nums[nums.length - 1] < target){
    	return res;
    }
    
    int start = 0, end = nums.length - 1;
    while(start < end){
    	if(nums[start] + nums[end] == target){
    	    res.add(Arrays.asList(nums[start], nums[end]));
            while(start < end && nums[start] == nums[start + 1]) start++;
            while(start < end && nums[end] == nums[end - 1]) end--;
        }
        
        if(nums[start] + nums[end] < target) start++;
        if(nums[start] + nums[end] > target) end--;
    }
    return res;
}