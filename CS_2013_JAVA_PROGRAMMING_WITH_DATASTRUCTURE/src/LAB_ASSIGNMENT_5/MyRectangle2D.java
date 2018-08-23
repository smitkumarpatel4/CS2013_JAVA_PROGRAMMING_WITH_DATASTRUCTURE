package LAB_ASSIGNMENT_5;

public class MyRectangle2D {
	
	
	double x;
	double y;
	double width;
	double height;
	
	MyRectangle2D(){
		this.x=0;
		this.y=0;
		this.width=1;
		this.height=1;
	}
	MyRectangle2D(double x, double y, double width, double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	MyRectangle2D(MyPoint centerPoint, double width, double height) {
        this(centerPoint.x, centerPoint.y, width, height);
	}
	
	public double getArea() {
		return (height*width);		
	}
	
	public double getPerimeter() {
		return 2*(height+width);
	}
	
	public boolean contains(double x, double y) {
		return (Math.abs(x-this.x) <= width/2) && (Math.abs(y-this.y) <= height/2);
	}
	
	public boolean contains(MyRectangle2D r) {
		boolean b= (contains(r.x-r.width/2,r.y+r.height/2)&&
				contains(r.x-r.width/2,r.y-r.height/2)&&
				contains(r.x+r.width/2,r.y+r.height/2)&&
				contains(r.x+r.width/2,r.y-r.height/2));
		return b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle2D r1= new MyRectangle2D(2.0,2.0, 5.5, 4.9);
		System.out.println(" area of rectangle is "+r1.getArea());
		System.out.println(" Perimeter of rectangle is "+r1.getPerimeter());
		System.out.println(" is Rectangle contains point ? " +r1.contains(3, 3));
		System.out.println(" is Rectangle contains rectangle ? "+r1.contains(new MyRectangle2D(4.0, 5.0, 10.5, 3.2)));
	}

}
