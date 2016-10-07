 import java.util.Arrays;

public class Course {
	
	private String name;
	private int remainingSeats;
	private Student[] students;
	private int credits;
	
	public Course(String name, int credits, int remainingSeats)
	{
		this.name = name;
		this.remainingSeats = remainingSeats;
		this.credits = credits;
		this.students = students;
		
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

	public Student[] getStudents() {
		return this.students;
	}
	
	public boolean addStudent(Student s2)
	{
		if(){
			this.remainingSeats = this.remainingSeats - 1;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void generateRoster()
	{
		
	}
	
	public double averageGPA()
	{
		
	}
	
	public String toString()
	{
		return this.name + ", worth " + this.credits;	
	}
}
