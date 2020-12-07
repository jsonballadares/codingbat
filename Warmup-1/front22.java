public String front22(String str) {
  String charactersToAppend = "";
  if(str.length() >= 2){
    charactersToAppend = str.substring(0,2);
  }else{
    charactersToAppend = str;
  }
  return charactersToAppend + str + charactersToAppend;
  
}
