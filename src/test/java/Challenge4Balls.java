

import processing.core.PApplet;

public class Challenge4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final float diameter=10;
    int xCoordinate=0;
    int yCoordinate=HEIGHT/5;
    
    public static void main(String args[]){
        PApplet.main("Challenge4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
        System.out.println("setup method");

    }

    @Override
    public void draw() {
        for ( int level = 1; level <=4 ; level++) {
            circle(xCoordinate*level,yCoordinate*level);
        }
        xCoordinate++;
    }

    private void circle(int speed,int level) {

        ellipse(speed,level, diameter, diameter);

    }

}
