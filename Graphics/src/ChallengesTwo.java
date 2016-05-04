import java.awt.*;
import java.util.Scanner;
import javax.swing.*;		 
public class ChallengesTwo extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
			        ChallengesTwo canvas = new ChallengesTwo();
			        JFrame frame = new JFrame();
			        frame.setSize(500, 500);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    		}
		    	public void paint(Graphics graphics)
		    		{
		    			Scanner userInput = new Scanner(System.in);
		    			System.out.println("Hello what location do you want your square to be at enter a number from 1 to 500 twice");
		    			int xVaule = userInput.nextInt();
		    			int yVaule = userInput.nextInt();
		    			System.out.println("Now enter two numbers between 1 and 30 for how big you want it to be twice.");
		    			int squareWidth = userInput.nextInt();
		    			int squareHeight = userInput.nextInt();
		    			Scanner userInput2 = new Scanner(System.in);
		    			System.out.println("What color do you want the square to be? Red or blue?");
		    			String squareColor = userInput2.nextLine();
		    			
		    			if(squareColor.equals("red") || squareColor.equals("Red"))
		    				{
		    					graphics.setColor(Color.red);
		    					graphics.fillRect(xVaule, yVaule, squareWidth, squareHeight);
		    					
		    				}
		    			else
		    				{
		    					graphics.setColor(Color.blue);
		    					graphics.fillRect(xVaule, yVaule, squareWidth, squareHeight);	
		    				}
		    			}

	}
	
	