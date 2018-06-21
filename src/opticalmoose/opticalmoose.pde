int i = 0;
void setup() {
  size(1000,500);
}
void draw() {
  background(#8E8E8E);
  eye(i, 250);
  eye(1000-i, 250);
  if(i>1000) {
  i = 0;
}
  i = i + 5; 
}
void eye(int x, int y) {
for(int w = 600;w > 0;w = w - 20) {
  noFill();
  ellipse(x,y,w,w);
}}