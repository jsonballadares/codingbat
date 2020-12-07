public boolean no14(int[] nums) {
  boolean containsFour = false;
  boolean containsOne = false;
  for(int x : nums){
    if(x == 4){
      containsFour = true;
    }
    if(x == 1){
      containsOne = true;
    }
  }
  return !(containsOne && containsFour);
}
