package CHAPTER_09_OBJECT_AND_CLASSES.copy;

import java.util.Date;

public class Ans_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        long time = 10000;
		        for (int i = 0; i < 8; i++, time *= 10) {
		            Date date = new Date(time);
		            System.out.println(date.toString());
		        }
		
	}

}
