public boolean lastDigit(int a, int b, int c) {
  int aRightMost = a % 10;
  int bRightMost = b % 10;
  int cRightMost = c % 10;
  
  return aRightMost == bRightMost || bRightMost == cRightMost || aRightMost == cRightMost;
}
