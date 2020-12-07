public int sum67(int[] nums) {
  int sum = 0;
  boolean ignoreSection = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 6){
      ignoreSection = true;
    }
  
    
    if(!ignoreSection){
      sum += nums[i];  
    }
    
        if(nums[i] == 7){
      ignoreSection = false;
    }
  }
  return sum;
}
