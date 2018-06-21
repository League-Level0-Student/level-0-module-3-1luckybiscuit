String a = " bottles of beer";
String b = " on the wall";
for(int i = 99;i>0;i--) {
  print("\n" + i + a + b + ",");
  print("\n" + i + a + ",");
  print("\nTake one down, pass it around, " + (i-1) + a + b);
}