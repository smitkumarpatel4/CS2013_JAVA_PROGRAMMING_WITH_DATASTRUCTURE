package LAB_ASSIGNMENT_3;

public class Ans_5_B_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j+" ");
				}
			for (int j = i-1; j >= 1; j--){
				System.out.print(j+" ");
				}
			System.out.println();
			}
	}
}
