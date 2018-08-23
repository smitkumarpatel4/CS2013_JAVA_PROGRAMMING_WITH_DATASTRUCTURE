package Midterm_1;

public class Find_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/***
	 * 
	 * 	int i=j=k=7;
		System.out.println(i + " "+j + " "+k);
		
		
			Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			j cannot be resolved to a variable
			k cannot be resolved to a variable
			j cannot be resolved to a variable
			k cannot be resolved to a variable

			at Midterm_1.Find_error.main(Find_error.java:8)


		***/
		
	/**	int a=1;
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a--);
		
		
		1
		2
		4
		4
		5
		6
		4
		3
		3
		
		***/
	
		/**
		double a=5%13;
		System.out.println(a);
		double b=5/10;
		System.out.println(b);
		
		
		5.0
		0.0
		
		**/
		
		
		
		/**
		int x=0,y=4;
		
		x = (++y > 4  ? ( y++ > 5 ? 1 : 2) : 3);
		System.out.println(x);
		
		
		x=2
		***/
		
		/***
		for(int i=10; i>=1; i/=2) {
			System.out.println(" Loop ");
			}
			
			Loop
			Loop
			Loop
			Loop
			****/
		
		/***
		do
		{
			while(1 ==1)
			{
				System.out.println("JAVA");
				break;
			}
		}while(true);
		
		
		java print infinitely
		
		*****/
		
		/**
		for(int i=0;i<3;i++)
		{
			System.out.println("JAVA");
		}
		
		JAVA
		JAVA
		JAVA
		***/
		
		/***
		String str1 ="abc:5";
		String str2 = "Abc:5";
		String str3 ="abc:"+5;
		String str4 ="Abc:"+(1+4);
		
		System.out.println(str1 == str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);
		
		true
		false
		true
		false
		true
		***/
		
	}

}
