public int search(int[] nums, int target){
	if(nums.length == 0){
		return -1;
    }
    int start = 0, end = nums.length - 1;
    while(start <= end){
    	if(nums[start] == target || nums[end] == target){
    	    return (nums[start] == target) ? start : end;
        }
        start++;
        end--;
    }
    return -1;
}

public int search(int[] nums, int target){
	if(nums.length == 0){
		return -1;
    }
    int start = 0, end = nums.length - 1;
    while(start < end){
    	int mid = (start + end)/2; 
        if(nums[mid] > nums[end]){
        	start = mid + 1;
        }else{
        	end = mid;
        }
    }
    
    int rotate = start;
    start = 0;
    end = nums.length - 1;
    while(start < end){
    	int mid = (start + end)/2;
        int realMid = (mid + rotate)%(nums.length);
        if(nums[realMid] < target){
        	start = realMid + 1;
        }else{
        	end = realMid;
        }
    }
    return (nums[start] != target) ? -1 : start;
}