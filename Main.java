import processing.core.PApplet;

public class Main extends PApplet {

    int x = 1;
    int y = 1;


    public static void main(String[] args) {
        PApplet.main("Main");
    }


    @Override
    public void settings() {
        super.settings();
        size(500, 500);
    }

    @Override
    public void setup() {
        super.setup();
        background(20);
        stroke(200);
        noFill();
        strokeWeight(2);
        rectMode(CENTER);
    }

    public void draw() {
        clear();
        fill(155,55,155);
        for (int x = 100; x < 450; x += 50) {
            for (int y = 100; y < 450; y += 50) {
                float r =random(40,50);
                rect(x,y,r,r);

            }


        }
    }

}