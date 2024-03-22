import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255,255,255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    for(int lineX = 15; lineX <= 200; lineX += 15){
      stroke(0,0,0);
      line(lineX, 0, lineX, 200);
    }
    for(int lineY = 15; lineY <= 200; lineY += 15){
      stroke(0,0,0);
      line(0, lineY, 200, lineY);
    }

    for (int circleY = 30; circleY <= 200; circleY += 35) {
      for (int circleX = 230; circleX <= 400; circleX += 35) {
        fill(212, 15, 125);
        ellipse(circleX, circleY, 20, 20);
      }
    }

    double colours = 0; 
    for(int lineX = 0; lineX <= 200; lineX ++){
      line(lineX, 200, lineX, 400);
      colours += 1.25;
      stroke((int)colours, (int)colours, (int)colours);

    }

    fill(225, 100, 0);
    stroke(0, 0, 0);
    ellipse(300, 300, 20, 125);

    fill(37, 108, 45);
    stroke(37, 108, 45);
    ellipse(300, 300, 30, 30);
  
  }
  
  // define other methods down here.
}