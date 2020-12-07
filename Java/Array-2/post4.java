public int[] post4(int[] nums) {
  int count = 0;
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] == 4){
      break;
    }
    count++;
  }
  int[] output = new int[count];
  
  int i = output.length - 1;
  int j = nums.length - 1;
  
  while(i >= 0 && j >= 0){
    output[i] = nums[j];
    
    i--;
    j--;
  }
  return output;
}
