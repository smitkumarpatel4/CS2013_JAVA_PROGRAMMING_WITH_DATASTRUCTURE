package CHAPTER_09_OBJECT_AND_CLASSES.copy;
import java.util.Random;

public class Ans_2_Random_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(1000);
			for (int i = 0; i < 50; i++){
				System.out.printf("%3d ", random.nextInt(101));
				if((i + 1) % 10 == 0){
					System.out.println();
				}
			}
	}
}
