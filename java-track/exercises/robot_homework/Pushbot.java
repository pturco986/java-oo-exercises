package robot_homework;

import java.util.ArrayList;

public class Pushbot extends Robot {
	
	private boolean haspushed;
	
	public Pushbot(String name, int positionx, int positiony, int speed, int orientation)
	{
		super(name, positionx, positiony, speed, orientation);
	}
	
	public void isPushed()
	{
		if (this.getSpeed() == this.speed)
		{
		this.haspushed = true;
		}
		else
		{
			this.haspushed = false;
		}
	}
	
	public static void main(String[] args) {
		Pushbot p = new Pushbot ("Pusher", 3, 3, 5, 1);
		Robot r = new Robot ("Tester", 3, 7, 5, 4);
		CarryBot b = new CarryBot("Holder", 3,4,5,2);
		
		ArrayList<Robot> robots = new ArrayList<Robot>();
			robots.add(p);
			robots.add(r);
			robots.add(b);
	}

}
