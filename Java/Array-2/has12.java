public boolean has12(int[] nums) {
  boolean doesOneExists = false;
  boolean doesTwoExists = false;
  int start = -1;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1){
      doesOneExists = true;
      start = i;
    }
  }
  
  if(start != -1){
    for(int i = start; i < nums.length; i++){
      if(nums[i] == 2){
        doesTwoExists = true;
      }  
    }  
  }else{
    doesTwoExists = false;
  }
    
  
  return doesOneExists && doesTwoExists;
}
