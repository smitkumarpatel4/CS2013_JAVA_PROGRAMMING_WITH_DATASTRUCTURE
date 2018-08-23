package CHAPTER_10_OBJECT_ORIENTED_THINKING;

import java.math.BigDecimal;

public class Ans_10_16 {

	public static void main(String[] args) {
		
        String n = "1";
        
        for (int i = 1; i < 50; i++) {

            n += "0";
        }

        BigDecimal num = new BigDecimal(n);
        int Count = 0;
        
        System.out.println(" first 10 numbers that are divide by two or three");
        while (Count < 10) {

            BigDecimal r2 = num.remainder(new BigDecimal(2));
            BigDecimal r3 = num.remainder(new BigDecimal(3));
            if (r2.equals(BigDecimal.ZERO) || r3.equals(BigDecimal.ZERO)) {
                Count++;
                System.out.println(num);
            }
            num = num.add(BigDecimal.ONE);
        }
    }
}
