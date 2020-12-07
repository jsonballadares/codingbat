public int[] withoutTen(int[] nums) {
  int[] output = new int[nums.length];
  int index = 0;
  for(int x : nums){
    if(x != 10){
      output[index++] = x;
    }
  }
  
  return output;
}
