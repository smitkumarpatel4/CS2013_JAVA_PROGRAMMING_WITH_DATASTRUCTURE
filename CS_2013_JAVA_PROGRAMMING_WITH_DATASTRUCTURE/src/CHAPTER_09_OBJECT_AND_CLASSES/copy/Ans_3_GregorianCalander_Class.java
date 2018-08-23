package CHAPTER_09_OBJECT_AND_CLASSES.copy;

import java.util.GregorianCalendar;

public class Ans_3_GregorianCalander_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar date = new GregorianCalendar();
			
		System.out.println(String.format("Current Date: %s", Ans_3_GregorianCalander_Class.print_date(date)));
				
		long millis = 1234567898765L;
		date.setTimeInMillis(millis);
		
		System.out.println(String.format("Date at %d milli-seconds past Unix Epoch: %s", millis , Ans_3_GregorianCalander_Class.print_date(date)));
			
	}
			
	public static String print_date(GregorianCalendar date) {
	
		return String.format(
								"%d-%d-%d %d:%d:%d.%d",
								date.get(GregorianCalendar.YEAR),
								date.get(GregorianCalendar.MONTH)+1,
								date.get(GregorianCalendar.DAY_OF_MONTH),
								date.get(GregorianCalendar.HOUR),
								date.get(GregorianCalendar.MINUTE),
								date.get(GregorianCalendar.SECOND),
								date.get(GregorianCalendar.MILLISECOND));
		
	}

}
