public int close10(int a, int b) {
  int ten = 10;
  if(Math.abs(a - ten) > Math.abs(b - 10)){
    return b;
  }else if(Math.abs(b - ten) > Math.abs(a - ten)){
    return a;
  }else{
    return 0;
  }
}
