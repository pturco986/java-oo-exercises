package robot_homework;

public class Robot {

	private String name;
	private int positionx;
	private int positiony;
	private int speed;
	private int orientation;
	private int distance;
	private int x;
	private int y;
	
	public Robot(String name, int positionx, int positiony, int speed, int orientation){
		this.name = name;
		this.positionx = positionx;
		this.positiony = positiony;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPositionx()
	{
		return this.positionx;
	}
	
	public int getPositiony()
	{
		return this.positiony;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getOrientation()
	{
		return this.orientation;
	}
	
	public int getDistance()
	{
		return this.distance;
	}
	//change orientation
	public void changeOrientation(int newOrientation)
	{
		this.orientation = newOrientation;
	}
	//change position for x
	public void changePositionx(int newPositionx)
	{
		this.positionx = newPositionx;
	}
	//change position for y
	public void changePositiony(int newPositiony)
	{
		this.positiony = newPositiony;
	}
	public String toString()
	{
		return "Name: " + this.name + ", Position x: " + this.positionx + ", Position y: " + this.positiony + ", orientation: " + this.orientation + ", Speed: " + this.speed;
	}
	
	public static void main(String args[])
	{
		Robot myRobot = new Robot("Bill", 0, 0,5, 1);
		System.out.println(myRobot.getName());
		Robot yourRobot = new Robot("Ted", 10, 0, 7, 4);
		System.out.println(yourRobot.getName());
		myRobot.changeOrientation(3);
		System.out.println(myRobot.getOrientation());
		System.out.println(myRobot);
		
	}
	
	
}
