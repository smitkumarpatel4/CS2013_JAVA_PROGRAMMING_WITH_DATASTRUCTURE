package LAB_ASSIGNMENT_5;

public class Triangle2D {

	MyPoint p1;
	MyPoint p2;
	MyPoint p3;
	
	Triangle2D(){
		this.p1= new MyPoint(0.0,0.0);
		this.p2= new MyPoint(1.0,1.0);
		this.p3= new MyPoint(2.0,5.0);
	}
	
	Triangle2D(double x1,double y1,double x2,double y2,double x3,double y3) {
		this.p1= new MyPoint(x1,y1);
		this.p2= new MyPoint(x2,y2);
		this.p3= new MyPoint(x3,y3);		
	}
	
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double  getArea() {
		double s1=p1.distance(p2);
		double s2=p2.distance(p3);
		double s3=p3.distance(p1);
		
		double s= (s1+s2+s3)/2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}
	
	public static double  getArea(MyPoint p1, MyPoint p2, MyPoint p3) {
		double s1=p1.distance(p2);
		double s2=p2.distance(p3);
		double s3=p3.distance(p1);
		
		double s= (s1+s2+s3)/2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}
		
	public double getPerimeter() {
		double s1=p1.distance(p2);
		double s2=p2.distance(p3);
		double s3=p3.distance(p1);
		
		return (s1+s2+s3);
	}
	
	public boolean contains(MyPoint p) {
		double a1= getArea(p1, p2, p);
		double a2= getArea(p1, p, p3);
		double a3= getArea(p, p2, p3);
		double a=getArea(p1,p2,p3);
		return (a == (a1+a2+a3));	
	}
	
	public boolean contains(Triangle2D t) {
		return (contains(t.p1) && contains(t.p2) && contains(t.p3))	;
	}
	
	public boolean overlaps(Triangle2D t) {
		return (contains(t.p1) || contains(t.p2) || contains(t.p3))	;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle2D t1=new Triangle2D(new MyPoint(2.5, 2.0), new MyPoint(4.2, 3.0),new MyPoint(5.0, 3.5));
		System.out.println(" area of t1 "+t1.getArea());
		System.out.println(" Perimeter of t2 "+t1.getPerimeter());
		System.out.println(" is triangle contains point ? "+t1.contains(new MyPoint(3.0, 3.0)));
		System.out.println(" is triangle contains triangle ? "+t1.contains(new Triangle2D(new MyPoint(2.9, 2.0), new MyPoint(4.0, 1.0),new MyPoint(1.0, 3.4))));
		System.out.println(" is traingle overlaps? "+ t1.overlaps(new Triangle2D(new MyPoint(2.0, 5.5), new MyPoint(4.0,-3.0),new MyPoint(2.0, 6.5))));

	}

}
