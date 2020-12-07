public boolean more14(int[] nums) {
  int oneCount = 0;
  int fourCount = 0;
  for(int x : nums){
    if(x == 1){
      oneCount++;
    }
    if(x == 4){
      fourCount++;
    }
  }
  return oneCount > fourCount;
}
