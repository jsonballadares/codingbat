public int[] evenOdd(int[] nums) {
  int[] output = new int[nums.length];
  int index = output.length - 1;
  
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] % 2 != 0){
      output[index--] = nums[i]; 
    }
  }
  
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] % 2 == 0){
      output[index--] = nums[i]; 
    }
  }

  return output;
}
