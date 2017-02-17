
public class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int min_index = 0;
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < prices.length; i++){
        	if(prices[i] < min){
        	min = prices[i];
            min_index = i;
            }
        }
        for(int j = min_index + 1; j < prices.length; j++){
        	if(prices[j] - min > max){
        	max = prices[j] - min;
            max_index = j;
            }
        }
        if(min_index == prices.length){
        	return 0;
        }
        return max;
    }
}

public class solution{
	public int maxProfit(int[] prices){
		if(prices.length == 0){
			return 0;
        }
		int min = prices[0];
		int profit = 0;
		for(int i : prices){
			if(i < min){
				min = i;
            }else{
            	profit = profit > i - min ? profit : i - min;
            }
        }
        return profit;
    }
}
