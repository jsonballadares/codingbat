public String startOz(String str) {
  String output = "";
  if(str.length() > 0 && str.charAt(0) == 'o' ){
    output += str.charAt(0);  
  }
  if(str.length() > 1 && str.charAt(1) == 'z'){
    output += str.charAt(1);
  }
  return output;
}
