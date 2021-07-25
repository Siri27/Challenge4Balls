

import processing.core.PApplet;

public class Challenge4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final float diameter=10;
    int x=0;
    int y=HEIGHT/5;
    private int i;


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
        for ( i = 1; i <=4 ; i++) {
            drawCircle();
        }
    }

    private void drawCircle() {

        ellipse(i*x,y*i, diameter, diameter);
        x++;

    }

    private void paintbg() {
        background(148,0,211);
    }

}
