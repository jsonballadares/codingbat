public String frontBack(String str) {
  if(str.length() <= 1){
    return str;
  }
  
  String front = str.substring(0,1);
  String end = str.substring(str.length()-1,str.length());
  String middle = str.substring(1,str.length()-1);
  return end + middle + front;
  
}
