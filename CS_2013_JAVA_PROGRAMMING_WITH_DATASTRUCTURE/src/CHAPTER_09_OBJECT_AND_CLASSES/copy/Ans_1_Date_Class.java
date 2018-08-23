package CHAPTER_09_OBJECT_AND_CLASSES.copy;

import java.math.BigInteger;

public class Ans_1_Date_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BigInteger j=new BigInteger("100000000000000000000");
		
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		
			for(long i = 10000; i <=1e11; i *= 10) {
				d.setTime(i);
				System.out.println(d.toString());
				
			}
	}

}
