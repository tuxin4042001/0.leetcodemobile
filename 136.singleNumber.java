//Answer
int singleNumber(int A[], int n) {
    int result = 0;
    for (int i = 0; i<n; i++)
    {
		result ^=A[i];
    }
	return result;
}

//my solution
public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            Integer num = new Integer(n);
            if(!set.add(num)){
                set.remove(num);
            }
        }
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            return iter.next().intValue();
        }
        return 0;
    }
}