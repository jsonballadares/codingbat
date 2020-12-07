public int teenSum(int a, int b) {
  int sum = a + b;
  boolean isTeen = (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
  if(isTeen){
    sum = 19;
  }
  return sum;
}
