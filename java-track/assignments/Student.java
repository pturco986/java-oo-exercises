
public class Student {
	
	private String name;
	private String ID;
	private int credits;
	private double GPA;
	private String legacy;
	
	public Student(String name, String ID, int credits, double GPA, String legacy){
		this.name = name;
		this.ID = ID;
		this.credits = credits;
		this.GPA = GPA;
		this.legacy = legacy;
	}
	
	double grade;
	int c;
	double g;
	int tuition;
	
	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}
	
	public int getCredits() {
		return credits;
	}

	public double getGPA() {
		return GPA;
	}

	public String getLegacy() {
		return legacy;
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
	
	public double submitGrade(){
		return this.GPA = ((g * c) / this.credits);
	}
	
	public int computeTuition(){
		
	}
	
	public String createLegacy(){
		return this.legacy = this.name + this.name;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
