package Midterm_2;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            //print top
			 int k= 7;
			 int i=1;
			 int j=0;
			 while (i<=k){
                    //spaces
				 j=1;
				 while(j<i) {
					 System.out.print(" ");
                     j++;
				 }
                    //numbers
				j=i;
				 while(j <= k) {
					 System.out.print(" "+ j);
                     j++;
				 }
           	i++;
            System.out.println();
             }

                   

             //print bottom triangle

           	 i=k-1;
			 while(i >=1 ) {
                    //spaces
			 		j=i;
			 		while(j > 1) {
                      System.out.print(" ");
                      j--;
			 		}

			 		//numbers
              		j=i;
			 		while(j <=k) {
                      System.out.print(" "+ j);
                      j++;
			 		}
            i--;
            System.out.println();
             }                  
	}
}