public int countEvens(int[] nums) {
  int count = 0;
  
  for(int x : nums){
    if(x % 2 == 0){
      count++;
    }
  }
  
  return count;
}
