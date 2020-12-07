public int[] maxEnd3(int[] nums) {
  if(nums[0] > nums[nums.length - 1]){
    nums[1] = nums[0];
    nums[nums.length - 1] = nums[0];
  }else if(nums[0] < nums[nums.length - 1]){
    nums[0] = nums[nums.length - 1];
    nums[1] = nums[nums.length - 1];
  }else{
    nums[1] = nums[0];
  }
  return nums;
}
