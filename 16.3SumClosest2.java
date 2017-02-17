import java.util.Arrays;

public class threeSumClosest {
	public static int threeSumClosest(int[] nums, int target){
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[2];
		int sum;
		for(int i = 0; i < nums.length - 2; i++){
			int start = i + 1;
			int end = nums.length - 1;
			if(i == 0 || i > 0 && nums[i] != nums[i - 1]){
				while(start < end){ 
					sum = nums[i] + nums[start] + nums[end];
					result = Math.abs(target - sum) > Math.abs(target - result) ? result : sum;
					if(result == target){
						return result;
	                }
					while(start < end && nums[start] == nums[start + 1]) start++;
					while(start < end && nums[end] == nums[end - 1]) end --;
					//Keypoint: it is different from 3Sum, here we cannot start++;end--, otherwise we will miss 
					//some value, instead, we consider if(sum > target)end--; else start++;
                    if(sum > target){
                    	end--;
                    }else{
                    	start++;
                    }
	            }
	        }
	    }
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,4,8,16,32,64,128};
        int target = 82;
        System.out.println(threeSumClosest(nums,target));
 	}

}
