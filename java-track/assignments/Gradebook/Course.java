package Gradebook;
import java.util.ArrayList;

public class Course {
	
	private String name;
	private int remainingSeats;
	private ArrayList<Student> students;
	private int credits;
	
	public Course(String name, int credits, int remainingSeats)
	{
		this.name = name;
		this.remainingSeats = remainingSeats;
		this.credits = credits;
		this.students = new ArrayList<Student>();
		
	}

	public String getName() {
		return this.name;
	}

	public int getCredits() {
		return this.credits;
	}

	public int getRemainingSeats() {
		return this.remainingSeats;
	}
	
	public boolean addStudent(Student s2)
	{
		if(remainingSeats > 0 && !this.students.contains(s2))
		{
			this.remainingSeats--;
			this.students.add(s2);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String generateRoster()
	{
		String studentList = "";
		for (Student student : this.students)
		{
			studentList += student.getName() + ", ";
		}
		return studentList;
	}
	
	public double averageGPA()
	{
		double gpasum = 0;
		for (Student student : this.students)
		{
			gpasum += student.getGPA();
		}
		gpasum = gpasum / this.students.size();
		return gpasum;
		
		
	}
	
	public String toString()
	{
		return this.name + ", worth " + this.credits;	
	}
}
