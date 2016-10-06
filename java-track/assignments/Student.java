public class Student {
	
	private String firstname;
	private String lastname;
	private int StudentID;
	private String name;
	private int credits;
	private int GPA;

	public Student(String firstname, String lastname, int StudentID){
		this.firstname = firstname;
		this.lastname = lastname;
		this.StudentID = StudentID;
		this.name = this.firstname + " " + this.lastname;
		this.credits = 0;
		this.GPA = ;
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
		if(credits < 30){
			return "Freshman";
		}
		else if(credits > 30 && credits < 60){
			return "Sophomore";
		}
		else if(credits > 60 && credits < 90){
			return "Junior";
		}
		else{
			return "Senior";
		}
	}
	
	public double submitGrade(double grade, int credits)
	{
		double qualityscore = grade * credits;
		double sumqualityscore = this.GPA * this.credits;
		double newGPA = ((qualityscore + sumqualityscore) / (credits + this.credits));
		newGPA = Math.round(newGPA * 1000) / 1000;
		return newGPA;
		
	}
	
	public int computeTuition()
	{
		
	}
	
	public Student createLegacy(Student s, Student ss)
	{
		 
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
