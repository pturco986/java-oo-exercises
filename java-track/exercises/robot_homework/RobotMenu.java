package robot_homework;

import java.util.ArrayList;
import java.util.Scanner;


public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;
	
	
	public static void main(String[] args)
	{
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do
		{
			x = rm.startMenu();
			rm.processInput(x);	
		}	while (x != 6);
	}
	
	public RobotMenu() 
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option: ");
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
		if (selection == 1) 
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
			System.out.println("Please enter a new number for the robot to move: ");
			int speed = s.nextInt();
			while (speed < 1)
			{
				System.out.println("Invalid selection, please try again: ");
				speed = s.nextInt();
			}
			System.out.println("Here is the robot's status after moving: ");
			System.out.println(r.getSpeed());
		}
		else if (selection == 4)
		{
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Rotate your robot in a cardinal direction. 1 for north, 2 for east, 3 for south, 4 for west: ");
			int orientation = s.nextInt();
			while(orientation < 1 || orientation > 4)
			{
				System.out.println("Invalid selection, please try again: ");
				orientation = s.nextInt();
			}
			System.out.println("Here is the robot's status after changing orientation: ");
			System.out.println(r.getOrientation());
		}
		else if (selection == 5)
		{
			displayRobots();
		}
		else if (selection == 6)
		{
			return;
		}	
	}
	
	private void displayRobots()
	{
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	private Robot selectRobot()
	{
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while (selection < 1 || selection > robots.size())
		{
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	private void createRobot()
	{
		System.out.println("Please enter a name for the robot: ");
		String name = s.next();
		System.out.println("Please enter the x coordinate of the robot: ");
		int positionx = s.nextInt();
		while (positionx < 0)
		{
			System.out.println("Invalid selection, please try again: ");
			positionx = s.nextInt();
		}
		System.out.println("Please enter the y coordinate of the robot: ");
		int positiony = s.nextInt();
		while (positiony < 0)
		{
			System.out.println("Invalid selection, please try again: ");
			positiony = s.nextInt();
		}
		System.out.println("Please enter a speed for the robot: ");
		int speed = s.nextInt();
		while (speed < 0)
		{
			System.out.println("That's not a speed at all! Please enter a speed for the robot: ");
			speed = s.nextInt();
		}
		System.out.println("Please enter the orientation of the robot. 1 for north, 2 for east, 3 for south, 4 for west: ");
		int orientation = s.nextInt();
		while (orientation < 1 || orientation > 4)
		{
			System.out.println("Invalid selection, please try again: ");
			orientation = s.nextInt();
		}
		robots.add(new Robot(name, positionx, positiony, speed, orientation));
	}
		
	

}