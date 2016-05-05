import java.awt.*;
import java.util.Scanner;
import javax.swing.*;		 
public class MovingSquare extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
		    		MovingSquare canvas = new MovingSquare();
			        JFrame frame = new JFrame();
			        frame.setSize(650, 650);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    		}
		    	public void paint(Graphics graphics)
		    	{
		    		
		    		for(int i= 0; i< 500; i++)
		    			{
		    				
		    				graphics.setColor(Color.blue);
		    				graphics.fillRect(i,i,20,20);
		    				
		    				delay();
		    				
		    				graphics.setColor(Color.white);
		    				graphics.fillRect(i, i, 20, 20);
		    			}
		    	}
		    	
		    	public void delay()
	    			{
	    	        try
	    					{
	    					Thread.sleep(25);
	    					} catch (InterruptedException e)
	    					{
	    					e.printStackTrace();
	    					}
	    			}
	}	    		