//My solution
public int maxArea(int[] height){
	int lh = 0, rh = height.length - 1;
	int leftIndex = lh, rightIndex = rh;
	int maxArea = 0;
	while(lh < rh){
		if(height[lh] < height[rh]){
			int leftIndex = lh;
			while(height[leftIndex] < height[lh] && leftIndex < rightIndex){
				leftIndex++;
            }
            if((Math.min(height[leftIndex], height[rh]))*(rh - leftIndex) > height[lh] * (rh - lh)){
            	lh = leftIndex;
             }
        }
        
        if(height[rh] < height[lh]){
        	int rightIndex = rh;
            while(height[rightIndex] < height[rh] && rightIndex > leftIndex){
            	rightIndex--;
             }
             if(Math.min(height[rightIndex], height[lh])*(rightIndex - lh) > height[rh] * ()
        }
    }
}