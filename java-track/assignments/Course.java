

public class Course {
	
	private String name;
	private int remainingSeats;
	private int students;
	private int credits;
	
	public Course(String name, int remainingSeats, int credits)
	{
		this.name = name;
		this.remainingSeats = remainingSeats;
		
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public int getStudents() {
		return students;
	}
	
	public boolean addStudent(Student s2)
	{
		
	}
	
	public void generateRoster(){
		
	}
	
	public double averageGPA()
	{
		
	}
	
	
}
