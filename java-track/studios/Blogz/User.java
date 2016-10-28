package Blogz;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class User extends Entity{
	protected String name;
	protected String password;
	protected static ArrayList<User> users = new ArrayList<User>();
	
	public User(String name, String password)
	{
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		User.users = users;
	}

	private static String hashPassword(String password)
	{
		return password;
	}
	
	private boolean isValidPassword(String password)
	{
		if(password == password){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean isValidUsername(String name)
	{
		return Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", name);
	}
}
