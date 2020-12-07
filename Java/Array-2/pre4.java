public int[] pre4(int[] nums) {
  int length = 0;
  for(int i = 0; nums[i] != 4; i++){
    length++;
  }
  int[] output = new int[length];
  for(int i = 0; nums[i] != 4; i++){
    output[i] = nums[i];
  }
  
  return output;
}
