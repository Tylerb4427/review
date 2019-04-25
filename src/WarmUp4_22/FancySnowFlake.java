package WarmUp4_22;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

    public FancySnowFlake(int x, int y, int w, int h,int speed) {
        super(x, y, w, h, Color.WHITE, 0, speed);
    }

    public void draw(Graphics window) {
        window.fillOval(super.getXPos(), super.getYPos(), super.getWidth() , super.getHeight());
    }

    public void moveAndDraw(Graphics window) {
        //window.setColor(Color.blue);
        //draw(window);
        this.setXPos(this.getXPos()-4+(int)(Math.random() * 9));
        this.setYPos(this.getYPos()+this.getYSpeed());
        window.setColor(Color.white);
        draw(window);
        if(this.getYPos()>600){
            this.setYPos(0);
            this.setXPos((int)(Math.random() * 800));}
    }
}
