package ASSIGNMENT_1;

public class Ans_2 {
	

	

		public static void main(String[] args){
			
			int sum=0;
		    int a=(int)(Math.random()*999) + 0;
			System.out.println(a);

			while(a != 0)
			{
				int s= a%10;
				a = a/10;
				
				sum = sum + s;
				
			};
			System.out.println("sum "+sum);
		}

}
