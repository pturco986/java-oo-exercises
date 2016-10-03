
public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getPerimeter(){
		return ((this.width + this.length) * 2);
	}
	
	public int getArea(){
		return (this.width * this.length);
	}
	
	public boolean square(){
		if(this.length == this.width){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean size(Rectangle other){
		if(this.getArea() > other.getArea()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return "Perimeter: " + this.getPerimeter() + ", Area: " + this.getArea() + ", Square: " + square();
	}
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5, 7);
		Rectangle otherRectangle = new Rectangle(3, 6);
		System.out.println(myRectangle);
		System.out.println("Is my rectangle larger than the other? " + myRectangle.size(otherRectangle));

	}

}
