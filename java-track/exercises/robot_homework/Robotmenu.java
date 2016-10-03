package robot_homework;

import java.util.ArrayList;
import java.util.Scanner;


public class Robotmenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;
	
	public static void main(String[] args)
	{
		int x = 0;
		Robotmenu rm = new Robotmenu();
		do
		{
			x = rm.startMenu();
			rm.processInput(x);	
		}	while (x != 6);
	}
	public Robotmenu() 
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a computer");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		while(selection < 0 || selection > 6)
		{
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection)
	{
		if(selection == 1)
		{
			createRobot();
		}
		else if (selection == 2)
		{
			displayRobots();
		}
		else if (selection == 3)
		{
			displayRobots();
			Robot r = selectRobot();
			System.out.println("");
			
		}
		
	}
	
	

}