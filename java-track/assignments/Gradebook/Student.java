package Gradebook;
public class Student {
	
	private String firstname;
	private String lastname;
	private int StudentID;
	private String name;
	private int credits;
	private double GPA;

	public Student(String firstname, String lastname, int StudentID){
		this.firstname = firstname;
		this.lastname = lastname;
		this.StudentID = StudentID;
		this.name = this.firstname + " " + this.lastname;
		this.credits = 0;
		this.GPA = 0;
	}
	
	public String getName() {
		return this.name;
	}

	public int getStudentID() {
		return this.StudentID;
	}
	
	public int getCredits() {
		return this.credits;
	}

	public double getGPA() {
		return this.GPA;
	}

	public String getClassStanding(){
		if(this.credits < 30){
			return "Freshman";
		}
		else if(this.credits < 60){
			return "Sophomore";
		}
		else if(this.credits < 90){
			return "Junior";
		}
		else{
			return "Senior";
		}
	}
	
	public void submitGrade(double grade, int credits)
	{
		double qualityscore = grade * credits;
		double sumqualityscore = this.GPA * this.credits;
		double newGPA = ((qualityscore + sumqualityscore) / (credits + this.credits));
		this.GPA = Math.round(newGPA * 1000d) / 1000d;
		this.credits += credits;
	}
	
	public double computeTuition()
	{
		double tuition = (this.credits / 15) * 20000;
		double remainder = (this.credits % 15) * 1333.33;
		double totaltuition = tuition + remainder;
		return totaltuition;
	}
	
	public Student createLegacy(Student s, Student ss)
	{
		Student legacy = new Student(firstname, lastname, StudentID);
			legacy.name = s.name + ss.name;
			legacy.StudentID = s.StudentID + ss.StudentID;
			legacy.credits = Math.max(s.credits, ss.credits);
			legacy.GPA = ((s.GPA + ss.GPA) / 2);
			
		return legacy;
	}

	public String toString()
	{
		return "Student name: " + this.name + ", credits earned: " + this.credits;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
