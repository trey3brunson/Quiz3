package Main;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3){
		this.side1= side1;
		this.side2= side2;
		this.side3= side3;
	}
	
	public double getSide1() {
		return side1;
	}

	
	public double getSide2() {
		return side2;
	}

	
	public double getSide3() {
		return side3;
	}
	
	public double getArea(){
		return 0.5 * side1 * side2;
		
	}
	public double getPerimeter(){
		return side1 + side2 + side3;
		
	}
	public String toString(){
		return "Side 1 of your tirangle is "+side1+ "Side 2 of your tirangle is "+side2+"Side 3 of your tirangle is "+side3;
	}

}
