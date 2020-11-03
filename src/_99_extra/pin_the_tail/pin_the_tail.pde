PImage donkey;
PImage tail;

void setup() {
  size(800,800);
}

void draw() {
  int bleh = mouseX-39;
  int bluh = mouseY-192;
  tail = loadImage("tail.gif");
  tail.resize(200,200);
  background(255,255,255);
  textSize(24);
  text("Pin the tail on the Donkey!", 400, 400);
  if(dist(711,213,mouseX,mouseY) < 30){
  donkey = loadImage("donkey.jpg");
  donkey.resize(800,800);
  background(donkey);
  }
  image(tail, bleh, bluh);
  fill(0,255,0);
  rect(0,0,30,30);
  rect(711,213,30,30);
  
}
