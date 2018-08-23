package LAB_ASSIGNMENT_4;

public class Rectangle {

	
		double width;
		double hight;
		
		Rectangle(){
			width=1;
			hight=1;
			
		}
		
		Rectangle(double w, double h){
			this.width=w;
			this.hight=h;
		}
		
		public double getArea() {
			return (hight*width);
		}
		
		public double getPerimeter() {
			return (2*(hight+width));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Rectangle r= new Rectangle();
			Rectangle r1 = new Rectangle(4.00, 40.00);
			Rectangle r2 = new Rectangle(3.5,35.9);
			
			System.out.println(" width:  " +r.width+ " hight: "+r.hight+ " Area: "+r.getArea()+ " Perimeter: "+r.getPerimeter() );
			System.out.println(" width:  " +r1.width+ " hight: "+r1.hight+ " Area: "+r1.getArea()+ " Perimeter: "+r1.getPerimeter() );
			System.out.println(" width:  " +r2.width+ " hight: "+r2.hight+ " Area: "+r2.getArea()+ " Perimeter: "+r2.getPerimeter() );
			
		}
}
