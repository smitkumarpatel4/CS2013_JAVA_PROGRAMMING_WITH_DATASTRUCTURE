package LAB_ASSIGNMENT_1;

public class Ans_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10 , c = 0;
		c = a++ + ++b - --b + ++a + --b - ++b - a++ + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
