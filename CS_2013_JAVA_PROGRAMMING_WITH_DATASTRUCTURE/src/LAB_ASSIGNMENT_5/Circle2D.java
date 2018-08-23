package LAB_ASSIGNMENT_5;

public class Circle2D {
	
	
	double x;
	double y;
	double radius;
	
	Circle2D(){
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	
	Circle2D(double x, double y, double r){
		this.x=x;
		this.y=y;
		this.radius=r;
	}
	
	public double getx() {
		return x;
		
	}
	public double gety() {
		return y;
		
	}
	
	public double getradius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*radius*2;
	}
	
	
	public void MyPoint(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void setradius(double r) {
		this.radius=r;
	}
	
	public boolean contains(double x1, double y1)
	{
		double d=(Math.sqrt(((this.x-x1)*(x*-x1))-((y-y1)*(y-y1))));
		//double d=Math.sqrt(Math.pow(getx() - x, 2) + Math.pow(gety() - y, 2));
		return(d < radius);

	}
	
	public boolean contains(Circle2D circle)
	{
		double a=Math.sqrt(Math.pow(circle.getx() - x, 2) + Math.pow(circle.gety() - y, 2)) ;
		return (a <= Math.abs(radius - circle.getradius()+2));
	}
	
	public boolean overlaps(Circle2D circle) {
		double b= Math.sqrt(Math.pow(circle.getx() - x, 2) + Math.pow(circle.gety() - y, 2));
		return (b <= radius + circle.getradius());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle2D c1 = new Circle2D(2.0, 2.0, 5.5);

		// Display results
		System.out.println("Circle area: " + c1.getArea()); 
		System.out.println("Circle perimeter: " + c1.getPerimeter()); 
		System.out.println("A Point is inside the Circle ? " + c1.contains(3, 3)); 
		System.out.println("circle1 contain the new circle ? " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("circle1 overlap the new circle ? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}


}
