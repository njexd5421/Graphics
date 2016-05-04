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
		    		for(int i = 0; i < 200; i++)
		    			{
		    				
		    			}
		    		
		    	}

	}
