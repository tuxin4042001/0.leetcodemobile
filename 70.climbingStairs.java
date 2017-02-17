//Answer
public int climbStairs(int n) {
    // base cases
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
    
    int one_step_before = 2;
    int two_steps_before = 1;
    int all_ways = 0;
    
    for(int i=2; i<n; i++){
    	all_ways = one_step_before + two_steps_before;
    	two_steps_before = one_step_before;
        one_step_before = all_ways;
    }
    return all_ways;
}
//My Solution
// c(n) = c(n-1) + c(n-2); c(1) = 1 and c(2) = 2, begin from c(3)
package _70_climbingStairs;

public class climbStairs2 {
    public int climbStairs(int n) {
        int[] stair = new int[n + 1];
        stair[0] = 1;
        stair[1] = 1;
        for(int i = 2; i <= n; i++){
        	stair[i] = stair[i - 1] + stair[i - 2];
        }
        return stair[n];
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
