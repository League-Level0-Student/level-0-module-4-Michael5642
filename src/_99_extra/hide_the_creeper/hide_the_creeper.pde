PImage creeper;
float x = random(600);
float y = random(600);
boolean creeperFound = false;
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
   if(creeperFound == false){
  if(mouseX <= 420 & mouseX >= 360 & mouseY <= 421 & mouseY >= 361){
  green = 255;
  red = 0;
  }
  fill(red,green,0);
  ellipse(mouseX,mouseY,20,20);
  if(mousePressed & mouseX <= 400 & mouseX >= 360 & mouseY <= 401 & mouseY >= 361){
    fill(0,0,0);
  text("you found the creeper!", 300, 300);
  
  creeperFound = true;
 }
   }
   else if(creeperFound == true){
     image(creeper, x, y);
     int red2 = 255;
     int green2 = 0;
     fill(red2,green2,0);
   ellipse(mouseX,mouseY,20,20);
   text("Find the next one!", 300, 300);
   if(mouseX <= x+40 & mouseX >= x-20 & mouseY <= y+40 & mouseY >= y-20){
  green2 = 255;
  red2 = 0;
  }
  if(mousePressed & mouseX <= x+40 & mouseX >= x-20 & mouseY <= y+40 & mouseY >= y-20){
    fill(0,0,0);
  text("you found the last creeper!", 300, 300);
   
 }
  
  
  
   }  
}
