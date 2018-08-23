package LAB_ASSIGNMENT_3;

public class Ans_5_D_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <=7; i++){
			for(int j = 1; j <=7-i; j++){
				System.out.print(1);
				}
			for (int j = 1; j <= i; j++){
				System.out.print(i);
				}
			System.out.println();
			}
	}
}
