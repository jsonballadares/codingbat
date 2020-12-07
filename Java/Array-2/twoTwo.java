public boolean twoTwo(int[] nums) {
  int singleCount = 0;
  int pairCount = 0;

  for(int i = 0; i < nums.length - 2; i++){
    if(nums[i] == 2 && nums[i + 1] == 2 && nums[i + 2] == 2){
      singleCount++;
    }
  }
  
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2){
      pairCount++;
    }
  }
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2){
      singleCount++;
    }
  }
  
  return 2 * pairCount - singleCount == 0;
}
