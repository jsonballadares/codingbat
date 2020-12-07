public boolean hasBad(String str) {
  if(str.length() <= 0){
    return false;
  }
  if(str.startsWith("bad") || str.substring(1).startsWith("bad")){
    return true;
  }
  return false;
}
