public int[] zeroFront(int[] nums) {
  int[] output = new int[nums.length];
  int index = output.length - 1;
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] != 0){
      output[index--] = nums[i];
    }
  }
  return output;
}
