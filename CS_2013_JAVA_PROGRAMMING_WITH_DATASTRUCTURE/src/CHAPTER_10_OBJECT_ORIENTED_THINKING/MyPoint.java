package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class MyPoint {
	
	double x;
	double y;
	
	MyPoint(){
		x=0;
		y=0;
	}
	
	
	MyPoint(double x, double y){
		this.x= x;
		this.y= y;
	}
	
	public void getX(int a) {
		x=a;
	}
	
	public void getY(int b) {
		y=b;
	}
	
	public double getDistance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	
	public double distance(MyPoint p2) {

        return getDistance(p2.x, p2.y);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1=new MyPoint();
		MyPoint p2=new MyPoint(10.0 , 30.5);
		System.out.println("the distance between two points is : "+ p1.distance(p2));
	}

}
