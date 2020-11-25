
void setup() {
PImage face = loadImage("face.jpg");
size(500,500);
face.resize(500,500);
image(face,0,0);}
void draw() {
  if(mousePressed){
    println(mouseX + "  " + mouseY); 
  }
 fill(0,0,255);
 if(mousePressed){
fill(0,255,0);}
ellipse(201,266,25,25);
ellipse(301,264,25,25);

fill(#150606);
ellipse(201,266,10,10);
ellipse(301,264,10,10);

}
