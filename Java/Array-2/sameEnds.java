public boolean sameEnds(int[] nums, int len) {
    String beg = "";
    String end = "";
    for(int i = 0; i < len; i++){
      beg += nums[i];
    }
    for(int i = nums.length - len; i < nums.length; i++){
      end += nums[i];
    }
    return beg.equals(end);
}
