public boolean sum28(int[] nums) {
  int sum = 0;
  for(int x : nums){
    if(x == 2){
      sum += x;
    }
  }
  return sum == 8;
}
