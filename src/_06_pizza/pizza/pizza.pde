
void setup() {
 size(630, 630);  
 fill(#FFC67C); 
 ellipse(315,315,500,500);
 fill(#F01811);
 ellipse(315,315,450,450);
 fill(#F2CF07);
 ellipse(315,315,425,425);
}
void draw() {
  if(mousePressed){
    fill(#F01811);
     ellipse(mouseX, mouseY, 50, 50);
  }
}
