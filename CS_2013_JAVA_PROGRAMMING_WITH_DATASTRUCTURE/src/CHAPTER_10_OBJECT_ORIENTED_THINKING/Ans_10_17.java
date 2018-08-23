package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.math.BigDecimal;

public class Ans_10_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal num = new BigDecimal(Long.MAX_VALUE);
        long a = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(a);
        int count = 0;


        while (count < 10) {

            BigDecimal s = n.multiply(n);
            if (s.compareTo(num) > 0) {
                count++;
                System.out.println(count+": " + n + " squared = " + s);
            }
            n = n.add(BigDecimal.ONE);
        }
	}
}
