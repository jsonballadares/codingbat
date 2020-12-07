public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = die1 + die2;
  if(noDoubles && die1 == die2){
    if(die1 == 6){
      sum = 6;
    }
    sum++;
  }
  return sum;
}
