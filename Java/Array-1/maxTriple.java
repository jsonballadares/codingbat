public int maxTriple(int[] nums) {
  if(nums.length == 0){
    return nums[0];
  }
  
  int first = nums[0];
  int middle = nums[nums.length / 2];
  int last = nums[nums.length - 1];
  
  int largest = Math.max(first,Math.max(middle,last));
  return largest;
}
