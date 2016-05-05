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
			        frame.getContentPane().add(canvas).setBackground(Color.gray);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    		}
		    	public void paint(Graphics graphics)
		    	{
		    		int whiteSquare = 80;
		    		int blackSquare = 80;
		    		int down = 80;
		    		int down2 = 80;
		    		for(int i = 0; i < 640; i++)
		    			{
		    				blackSquare+=160;
		    				graphics.setColor(Color.black);
		    				graphics.fillRect(blackSquare,down2,80,80);
		    				down2 = down2+down2;
		    			}
		    		for(int c= 0; c < 640; c++)
		    			{
		    				whiteSquare+=160;
		    				graphics.setColor(Color.white);
		    				graphics.fillRect(whiteSquare,down,80,80);
		    				down= down+down;
		    				
		    			
		    			}
		    	}

	}
