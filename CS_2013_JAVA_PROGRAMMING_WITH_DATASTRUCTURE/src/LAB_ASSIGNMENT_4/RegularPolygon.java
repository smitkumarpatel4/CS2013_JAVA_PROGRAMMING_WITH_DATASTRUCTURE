package LAB_ASSIGNMENT_4;

public class RegularPolygon {
	
	private int n;
	private double side;
	private double x;
	private double y;
	
	RegularPolygon(){
		this.n=3;
		this.side=1;
		this.x=0;
		this.y=0;
		}
	
	RegularPolygon(int n, double side){
		this.n=n;
		this.side=side;
		this.x=0;
		this.y=0;
		}
	RegularPolygon(int n, double side, double x, double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
		}
	
	public int getn() {
		return n;
	}
	public double getside() {
		return side;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	
	public void setn(int n) {
		this.n=n;
	}
	public void setside(double side) {
		this.side=side;
	}
	public void setx(double x) {
		this.x=x;
	}
	public void sety(double y) {
		this.y=y;
	}
	
	public void setData(int n, double side, int x, int y) {
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	
	public double getPerimeter() {	
	return n*side;
	}
	
	public double getArea() {
		return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
	}

	
	public static void main(String[] args) {
		
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(" for regularpolygone 1, area is "+ rp1.getArea()+ " and perimeter is " +rp1.getPerimeter());
		System.out.println(" for regularpolygone 2, area is "+ rp2.getArea()+ " and perimeter is " +rp2.getPerimeter());
		System.out.println(" for regularpolygone 3, area is "+ rp3.getArea()+ " and perimeter is " +rp3.getPerimeter());
	}

}
