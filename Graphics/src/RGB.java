import java.awt.*;
import java.util.Scanner;
import javax.swing.*;		 
public class RGB extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
		    		RGB canvas = new RGB();
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
		    		
		    		
		    		for(int red = 0; red< 255; red++)
		    				{

		    				
		    			
		    		for(int green= 0; green< 255; green++)
		    					{
		    				
		    				
		    			
		    		for(int blue = 0; blue < 255; blue++)
		    						{
		    							
		    		    				graphics.setColor(new Color(red,green,blue));
		    		    				graphics.fillRect(100, 200, 100, 100);
		    		    				
		    		    				
		    						}
		    					}
		    				}
		    		
		    		
		    	}
		    	public void delay()
	    			{
	    	        try
	    					{
	    					Thread.sleep(1);
	    					} catch (InterruptedException e)
	    					{
	    					e.printStackTrace();
	    					}
	    			}
	}