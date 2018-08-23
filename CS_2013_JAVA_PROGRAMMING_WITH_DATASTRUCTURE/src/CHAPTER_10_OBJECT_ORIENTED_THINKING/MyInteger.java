package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class MyInteger {
	int value;

public MyInteger(int value) {
	this.value = value;
	}

public Integer getValue() {
	return value;
	}

public boolean isEven() {
	return (value % 2 == 0);
	}

public boolean isOdd() {
	return (value % 2 != 0);
	}

public boolean isPrime() {
	int factor = 0;
	boolean b;
	for (factor = 2; factor <= value / 2; factor++) {
	 if (value % factor != 0) return true;
	 
	}
	return false;
}

public boolean isEven(int value) {
	
	return (value % 2 == 0); 
	}

public static boolean isOdd(int value) {
	return (value % 2 != 0);
	}

public static boolean isPrime(int value) {
	int factor = 0;
	boolean b;
	for (factor = 2; factor <= value / 2; factor++) {
	 if (value % factor != 0) return true;
	 
	}
	return false;
	}

public static boolean isEven(MyInteger myInt) {
    return myInt.isEven(myInt.getValue());
	}

public static boolean isOdd(MyInteger myInt) {
	return myInt.isOdd(myInt.getValue());
	}


public static boolean isPrime(MyInteger MyInt) {
	return MyInt.isPrime(MyInt.getValue());
	}

public boolean equals(int intValue) {
	return value == intValue;
	}

public boolean equals(MyInteger myInt) {
	return equals(myInt.getValue());
	}
public static int parseInt(String value) {
    return Integer.parseInt(value);
}
		
		
public static void main(String[] args) {
	MyInteger n1 = new MyInteger(23);
	MyInteger n2 = new MyInteger(26);
	MyInteger n3 = new MyInteger(4456);
	
	System.out.println("n1 is even? " + n1.isEven());
	System.out.println("n1 is prime? " + n1.isPrime());
	System.out.println("15 is prime? " + MyInteger.isPrime(15));

	String s = "7468";
	System.out.println(MyInteger.parseInt(s));
	
	System.out.println("n2 is odd? " + n2.isOdd());
	System.out.println("45 is odd? " + MyInteger.isOdd(45));
	System.out.println("n1 is equal to n2? " + n1.equals(n2));
	System.out.println("n1 is equal to 23? " + n1.equals(23));
	
	System.out.println("n3 is odd? " + n3.isOdd());
	System.out.println("n3 is even? " + n3.isEven());	
	System.out.println("n1 is equal to n3? " + n1.equals(n3));
	System.out.println("n3 is equal to ? " + n3.equals(4456));
	
	}

	
}
