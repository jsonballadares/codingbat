public boolean lucky13(int[] nums) {
  for(int x : nums){
    if(x == 3 || x == 1){
      return false;
    }
  }
  return true;
}
