public String lastChars(String a, String b) {
  String output = "";
  if(a.length() == 0){
    output += "@";
  }else{
    output += a.charAt(0);
  }
  
  if(b.length() == 0){
    output += "@";
  }else{
    output += b.charAt(b.length() - 1); 
  }
  
  return output;
}
