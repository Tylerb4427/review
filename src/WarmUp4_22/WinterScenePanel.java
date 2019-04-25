package WarmUp4_22;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<FancySnowFlake2> shapes;
        private List<FancySnowFlake> shapes2;
	private AbstractShape sMan;
        //private FancySnowFlake snowflake = new FancySnowFlake(100,100,100,100,3);

	public WinterScenePanel()
	{
                shapes = new ArrayList<>();
                shapes2 = new ArrayList<>();
		setVisible(true);
                sMan=new SnowMan(100,300,100,300);
                for(int i=0;i<100;i++){
                    int size = 10+(int)(Math.random() * 30);
                    shapes.add(new FancySnowFlake2((int)(Math.random() * 800),(int)(Math.random() * 600),size,size,size/8));}
                for(int i=0;i<100;i++){
                    int size = 5+(int)(Math.random() * 5);
                    shapes2.add(new FancySnowFlake((int)(Math.random() * 800),(int)(Math.random() * 600),size,size,size/2));}
                

		//refer shapes to a new ArrayList of AbstractShape

		//populate the list with 50 unique snowflakes

		//instantiate a snowman

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);
                sMan.draw(window);
                for(FancySnowFlake2 i:shapes)
                    i.moveAndDraw(window);
                
                for(FancySnowFlake i:shapes2)
                    i.moveAndDraw(window);
		//make the snowman appear
		//make the snowflakes appear and move down the screen
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}