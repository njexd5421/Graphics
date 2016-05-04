import java.awt.*;

import javax.swing.*;
 
public class MyCanvas extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(1010, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics) 
    		{
    		graphics.setColor(Color.black);
    		graphics.drawLine(0,0,660,500);
    		
	        graphics.setColor(Color.black);
	        graphics.drawLine(500, 0, 10, 360);
	        
	        graphics.setColor(Color.black);
	        graphics.drawRect(0, 250, 800, 50);
	        
	        graphics.setColor(Color.black);
	        graphics.drawRect(-1, 99, 1001, 51);
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(0, 100, 1000, 50);
	        
	        graphics.setColor(Color.blue);
	        graphics.drawRect(849, 414, 151, 151);
	        
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(850, 415, 150, 150);
	        
	        
	       graphics.setColor(Color.black);
	       graphics.drawOval(399, 299, 201, 201);
	       graphics.setColor(Color.blue);
	       graphics.fillOval(400, 300, 200, 200); 
	       
	       graphics.setColor(Color.red);
	       graphics.drawRect(529, 349, 51, 51);
	       graphics.fillRect(530,350,50,50);
	       
	       graphics.setColor(Color.red);
	       graphics.drawRect(449, 349, 51, 51);
	       graphics.fillRect(450,350,50,50);
	       
	       graphics.setColor(Color.red);
	       graphics.drawOval(479,429,101,51);
	       graphics.fillOval(480,430,100,50);
	       
	}
	} 	