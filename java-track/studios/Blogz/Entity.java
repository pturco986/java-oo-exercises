package Blogz;

import java.util.ArrayList;


public abstract class Entity {
	private static ArrayList<Entity> entity= new ArrayList<Entity>();
	private final int uid;
	public Entity()
	{
		uid = entity.size() + 1;
	}
	public int getUid() 
	{
		return uid;
	}
	

	
	
	
	
	
}
