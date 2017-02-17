public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
}

//delete method
public static int[] delete(int[] nums, int index1, int index2, int index3){
	int[] result;
	int index = 0;
	for(int i = 0; i < nums.length; i++){
		if(i == index1 || i == index2 || i == index3){
			continue;
        }else{
        	result[index++] = nums[i];
        }
    }
    return result;
}

public static List<Integer> delete (int[] nums, int index1, int index2, int index3){
	List<Integer> result = new ArrayList<Integer>();
	for(int i = 0; i < nums.length; i++){
		if(i == index1 || i == index2 || i == index3){
			continue;
        }else{
        	result.add(nums[i]);
        }
    }
    return result;
}

// test delete methed
public static void main(String[] args){
	int[] nums = {1,2,3,4,5,6,7,8,9,0};
	int index1 = 2, index2 = 4, index3 = 6;
	3Sum su =new Sum();
	int[] result = su.delete(nums, index1, index2, index3);
	for(int i : result){
		System.out.println(i);
    }
    
   List<Integer> result = 3Sum.delets(nums, index1, index2, index3);
   Iterator<Integer> iter = result.iterator();
   while(iter.hasNext()){
   	System.out.println(iter.next());
   }
}