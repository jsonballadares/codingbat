public boolean frontAgain(String str) {
  if(str.length() < 2){
    return false;
  }
  return str.startsWith(str.substring(str.length() - 2));
}
