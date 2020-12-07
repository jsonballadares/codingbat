public int bigDiff(int[] nums) {
  int largest = nums[0];
  int smallest = nums[0];
  for(int x : nums){
    if(x > largest){
      largest = x;
    }
    if(x < smallest){
      smallest = x;
    }
  }
  return largest - smallest;
}
