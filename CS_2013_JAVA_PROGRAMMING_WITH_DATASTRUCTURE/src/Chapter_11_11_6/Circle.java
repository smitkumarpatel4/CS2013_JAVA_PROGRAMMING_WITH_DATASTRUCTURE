/***
 *   Exercise 11.6   Circle   Loan    Test_Exercise_11_6
 */
package Chapter_11_11_6;

public class Circle {
	private double radius = 1;
	private static int numberOfObjects = 0;

	public Circle() {
		numberOfObjects++;
	}

	public Circle(double r) {
		this.radius = r;
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return "radius" +radius;
	}

}
