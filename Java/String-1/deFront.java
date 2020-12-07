public String deFront(String str) {    
  String aboveSecond = str.substring(2);
  String front = "";
  if(str.charAt(0) == 'a'){
    front += "a";
  }
  if(str.charAt(1) == 'b'){
    front += "b";
  }
  return front + aboveSecond;
}
