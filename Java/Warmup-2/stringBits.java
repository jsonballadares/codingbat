public String stringBits(String str) {
  String output = "";
  for(int i = 0; i < str.length(); i+=2){
    output += str.charAt(i);
  }
  return output;
}
