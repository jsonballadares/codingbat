public String middleThree(String str) {
  int beginMiddle = (str.length() / 2) - 1;
  int endMiddle = beginMiddle + 3;
  return str.substring(beginMiddle,endMiddle);
}
