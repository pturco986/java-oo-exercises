package robot_homework;

public class CarryBot extends Robot {
	
	private boolean grabObject;
	private boolean holdObject;
	
	public CarryBot(String name, int positionx, int positiony, int speed, int orientation)
	{
		super(name, positionx, positiony, speed, orientation);
		this.grabObject = true;
		this.holdObject = true;
	}
	
	public void isGrab()
	{
		this.grabObject = true;
	}
	
	public void notGrab()
	{
		this.grabObject = false;
	}
	
	public void holdsObject()
	{
		if(this.grabObject = true)
		{
			this.holdObject = true;
			System.out.println("This robot holds an object!");
		}
		else
		{
			this.holdObject = false;
		}
	}


}
