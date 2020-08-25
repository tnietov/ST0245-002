public boolean groupSum6(int start, int[] nums, int target) {
  if(start>=nums.length){
    if(target==0)return true;
    else return false;
  }else if(nums[start]==6)return(groupSum6(start+1,nums,target-nums[start]));
  else return(groupSum6(start+1,nums,target) || groupSum6(start+1,nums,target-nums[start]));
}




public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start>=nums.length){
      if(target==0)return true;
      else return false;
  }
  else{
    return groupNoAdj(start+2,nums,target-nums[start])|| groupNoAdj(start+1,nums,target);
  }
}




public boolean groupSum5(int start, int[] nums, int target) {
  if(start>=nums.length){
    if(target==0)return true;
    else return false;
  }else{
    if(nums[start]%5==0){
       return groupSum5(start+1,nums,target-nums[start]);
    }else{
      if(nums[start]==1 && start>1 && nums[start-1]%5==0  ) return groupSum5(start+1,nums,target);
      else
      return groupSum5(start+1,nums,target-nums[start])||groupSum5(start+1,nums,target);
    }
  } 
}





public boolean groupSumClump(int start, int[] nums, int target) {
  if(start>=nums.length){
   if(target==0)return true;
   else return false;
  }else{
    if(start<nums.length-1){
        int n=start+1;
        int m=1;
        while(nums[start]==nums[n]){
          m++;
          n++;
        }
        return groupSumClump(start+m,nums,target-(nums[start]*m))|| groupSumClump(start+m,nums,target);
    }
    else return groupSumClump(start+1,nums,target-nums[start])|| groupSumClump(start+1,nums,target);
  }
}





public boolean splitArray(int[] nums) {
  return helper(0,nums,0,0);
}
private boolean helper(int start, int[] nums,int sum1, int sum2){
  if(start>=nums.length){
    if(sum1==sum2)return true;
    else return false;
  }else{
    return helper(start+1,nums,sum1+nums[start],sum2)||helper(start+1,nums,sum1,sum2+nums[start]);
  }
}
