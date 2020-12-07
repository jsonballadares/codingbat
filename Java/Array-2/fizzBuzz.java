public String[] fizzBuzz(int start, int end) {
  String[] output = new String[end - start];
  int count = 0;
  while(start < end){
    if(start % 3 == 0 && start % 5 == 0){
      output[count] = "FizzBuzz";
    }else if(start % 3 == 0){
      output[count] = "Fizz";
    }else if(start % 5 == 0){
      output[count] = "Buzz";
    }else{
      output[count] = String.valueOf(start);
    }
    start++;
    count++;
  }
  return output;
}
