PImage face;
boolean boomer;
void setup() {
  size(800,600);
  face = loadImage("burningEyes.jpg");
  face.resize(800,600);
  
}

void draw() {

  background(255,255,255);
  //eye balls
  fill(255,255,255);
  ellipse(350,300,100,100);
  ellipse(450,300,100,100);
  //pupils
  fill(0,0,0);
  while(!boomer){
  if(mouseX<=500 || mouseX>=500 && mouseY<=400 || mouseY>=400){
  mouseX = 350;
  mouseY = 300;
  }
  ellipse(mouseX-50,mouseY,50,50);
  ellipse(mouseX+50,mouseY,50,50);
  }
}
