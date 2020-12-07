public int[] tenRun(int[] nums) {
  int multipleOfTen = -1;
  boolean nextMultipleOfTen = false;
  for(int i = 0; i < nums.length; i++){
    if(nextMultipleOfTen && nums[i] % 10 != 0){
      nums[i] = multipleOfTen;
      continue;
    }
    if(nums[i] % 10 == 0){
      nextMultipleOfTen = true;
      multipleOfTen = nums[i];
    }
  }
  return nums;
}
