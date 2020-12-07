boolean doubleX(String str) {
  boolean fistInstanceOfX = false;
  for(int i = 0; i < str.length() - 1; i++){
    if(str.charAt(i) == 'x'){
      return str.charAt(i + 1) == 'x';
    }
  }
  return false;
}
