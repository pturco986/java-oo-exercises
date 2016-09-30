
public class Fraction {

	private double n;
	private double d;
	
	public Fraction(double n, double d){
		this.n = n;
		this.d = d;
	}
	
	public double getN(){
		return this.n;
	}
	
	public double getD(){
		return this.d;
	}
	
	public double getFraction(){
		double fraction = this.n / this.d;
		return fraction;
	}
	
	public double fracsum(Fraction other){
		double fracsum = (this.getFraction() + other.getFraction());
		return fracsum;	
	}
	
	public double fracmult(Fraction other){
		double fracmult = (this.getFraction() * other.getFraction());
		return fracmult;
	}
	
	public double reciprocal(){
		double reciprocal = (this.d/this.n);
		return reciprocal;
	}
	
	public double simplify(){
		if((this.n/this.d) % this.d == 0){
			return ((this.n/this.d) / this.n);
		}
		else
		{
			return getFraction();
		}
	}
	
	
	public static void main(String[] args) {
		Fraction myFraction = new Fraction (2, 4);
		Fraction otherFraction = new Fraction (5, 7);
		System.out.println("Adding two fractions = " + myFraction.fracsum(otherFraction));
		System.out.println("Multiplying two fractions = " + myFraction.fracmult(otherFraction));
		System.out.println("The reciprocal = " + myFraction.reciprocal());
		System.out.println("The simplified fraction, if it can be simplified, = " + myFraction.simplify());
		
		
	}

}
