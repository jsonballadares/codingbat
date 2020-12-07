public String conCat(String a, String b) {
  String concatenation = a + b;
  if(concatenation.length() == Math.max(a.length(),b.length())){
    return concatenation;
  }
  
  if(concatenation.charAt(a.length() - 1) == concatenation.charAt(a.length())){
    return concatenation.substring(0,a.length()) + concatenation.substring(a.length() + 1);  
  }
  
  return concatenation;
}
