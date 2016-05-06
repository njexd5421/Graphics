import java.awt.*;
import java.util.Scanner;
import javax.swing.*;		 
public class Checkerboard extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
			        Checkerboard canvas = new Checkerboard();
			        JFrame frame = new JFrame();
			        frame.setSize(640, 640);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    		}
		    	public void paint(Graphics graphics)
		    	{
		    		graphics.setColor(Color.BLUE);
		    		for(int colum = 10; colum < 160; colum += 40)
		    			{
		    				for(int row = 10; row < 160; row+=40)
		    					{
		    						graphics.drawRect(row,colum,19,19);
		    						graphics.fillRect(row+20,colum, 20, 20);
		    					}
		    					
		 
		    			}
		    		
		    		for(int i = 30; i < 160; i += 40)
		    			{
		    				
		    				for(int row = 10; row< 160; row+=40)
		    					{
		    						
		    						graphics.fillRect(row, i, 20, 20);
		    						graphics.drawRect(row+20, i, 19, 19);
		    					}
		    			}
		    	
		    	
		    	}	

	}
