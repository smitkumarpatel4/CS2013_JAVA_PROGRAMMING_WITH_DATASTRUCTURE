package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class BMI {
	double w_kg;
	double h_m;
	double Bmi;
	String name;
	int age;
	
	
	public BMI(String name, int age,double weight,double feet, double inches) {
		this.name= name;
		this.age=age;
		double w_p = weight;
		double h_f = feet;
		double h_i = inches;
		
		this.w_kg = w_p / 0.45359273;
		this.h_m = (h_i / 0.0254)+(h_f/15*0.0254);
		
		this.Bmi= w_kg/(h_m*h_m);
		
		System.out.println(name +"'s age is "+age+" and BMI is "+ Bmi);
		
		if(Bmi<18.5)
			System.out.println(" underweight ");
		else if(Bmi<25)
			System.out.println(" normal ");
		else if(Bmi<30)
		System.out.println(" overweight ");
		else 
			System.out.println(" obesity ");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI b= new BMI("smit", 23, 50.0, 7.0, 9.0);
	}

}
