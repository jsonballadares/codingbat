public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile && bSmile){
    return true;
  }
  return !(aSmile || bSmile);
}
