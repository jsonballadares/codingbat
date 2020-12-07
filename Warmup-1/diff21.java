public int diff21(int n) {
  int absoluteDifference = Math.abs(n - 21);
  if(n > 21){
    return 2 * absoluteDifference;
  }
  return absoluteDifference;
}
