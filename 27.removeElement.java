//这里有两点注意，1是找出长度，2是还需要
//在原来数组的基础上将不等于val的值的数
//记录下来，可无序
public int removeElement(int[] nums, int val){
int begin = 0;
for(int i =0;i<nums.length;i++){
if(nums[i]!=val)nums[begin++]=nums[i];
}
return begin;
}
