PImage creeper;
float x = random(600);
float y = random(600);
void setup() {
  size(600,600);
  
  
  
}

void draw() {
  PImage minecraft = loadImage("green.png");
  minecraft.resize(600,600);
  background(minecraft);
  creeper = loadImage("creeper.jpg");
  creeper.resize(20,20);
   image(creeper, 380, 381);
   int red = 255;
   int green = 0;
   
  if(mouseX <= 420 & mouseX >= 360 & mouseY <= 421 & mouseY >= 361){
  green = 255;
  red = 0;
  }
  fill(red,green,0);
  ellipse(mouseX,mouseY,20,20);
  if(mousePressed & mouseX <= 400 & mouseX >= 360 & mouseY <= 401 & mouseY >= 361){
    fill(0,0,0);
  text("you found the creeper!", 300, 300);
  image(creeper, x, y);
  
 }
 else{}
 text("try to find it again!",300,300);
  
  
  
  
}
