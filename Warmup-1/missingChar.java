public String missingChar(String str, int n) {
  return str.replace(str.substring(n,n+1),"");
}
