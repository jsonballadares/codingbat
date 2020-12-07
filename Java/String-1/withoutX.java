public String withoutX(String str) {
  String output = "";
  for(int i = 0; i < str.length(); i++){
    if((i == 0 || i == str.length() - 1) && str.charAt(i) == 'x'){
      continue;
    }else{
      output += str.charAt(i);
    }
  }
  return output;
}
