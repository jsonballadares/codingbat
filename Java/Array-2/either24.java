public boolean either24(int[] nums) {
  boolean twoNextToTwo = false;
  boolean fourNextToFour = false;
  
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2){
      twoNextToTwo = true;
    }
    if(nums[i] == 4 && nums[i + 1] == 4){
      fourNextToFour = true;
    }
  }
  return (fourNextToFour || twoNextToTwo) && !(twoNextToTwo && fourNextToFour);
}

