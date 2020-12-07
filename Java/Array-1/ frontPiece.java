public int[] frontPiece(int[] nums) {
  if(nums.length == 0 || nums.length < 2){
    return nums; 
  }
  
  return new int[]{nums[0],nums[1]};
}
