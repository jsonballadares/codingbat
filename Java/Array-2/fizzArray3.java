public int[] fizzArray3(int start, int end) {
  int[] output = new int[end - start];
  for(int i = 0; i < output.length; i++){
    output[i] = start++;
  }
  return output;
}
