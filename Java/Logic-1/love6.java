public boolean love6(int a, int b) {
  int sum = a + b;
  int difference = Math.abs(a - b);
  
  return a == 6 || b == 6 || sum == 6 || difference == 6;
}
