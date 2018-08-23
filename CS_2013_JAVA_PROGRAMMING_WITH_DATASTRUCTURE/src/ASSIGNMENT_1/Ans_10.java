package ASSIGNMENT_1;
	import java.util.Scanner;

	public class Ans_10 {
		
		 public static void main(String[] args)
		 {
				Scanner ip= new Scanner(System.in);
				
				System.out.println(" Enter three digit number ");
				int num = ip.nextInt();
				int temp= num;
				int rem=0;
				int sum=0;
				
				while(num>0){
					 rem = num % 10;
					 num = num/10;
					 sum = sum*10 + rem ;
				}
				
				if( sum == temp)
				{
					System.out.println(+temp + " is a palidrome ");
				}
				else{
					System.out.println(+temp+ " is not a palidrome");
				}
		 }

}
