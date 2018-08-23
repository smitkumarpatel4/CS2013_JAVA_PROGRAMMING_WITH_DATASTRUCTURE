package LAB_ASSIGNMENT_5;



public class MyPoint {
		
	double x;
	double y;
	
	public MyPoint(){
		x=0;
		y=0;
	}
	
	
	public MyPoint(double x, double y){
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
		
}
