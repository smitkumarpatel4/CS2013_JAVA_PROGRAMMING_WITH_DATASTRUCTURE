/****** 
 * Exercises 10.22
 *   
 * 
 * @author Smit Patel
 *
 */

package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class MyString1 {
	char[] c;
	public MyString1(char[] chars) {
		this.c = new char[chars.length];
		
		System.arraycopy(chars, 0, this.c, 0, chars.length);
	    }
	
	public MyString1 print() {
		for(int i = 0; i < this.length(); i++) {
			System.out.print(this.c[i]);
	        }
		return this;
	}
	
	public char charAt(int index) {
		return c[index];
	    }
	
	public int length() {
	    return c.length;
	    }
	    
	public MyString1 substring(int begin, int end) {
		int l= end-begin;
		char[] substring = new char[l];	        
	        for(int i = begin; i < end; i++) {
	            substring[i-begin] = this.charAt(i);
	        }
	        
	        return new MyString1(substring);
	    }
	
	public char[] toChars() {
		char[] ch = new char[this.length()];
		System.arraycopy(this.c,0,ch,0, this.length());
	    return ch;
	    }
	
	public MyString1 toLowerCase() {
		for(int i = 0; i < this.length(); i++) {
			this.c[i] = Character.toLowerCase(this.c[i]);
			}
		return this;
	    }
	
	public boolean equals(MyString1 s) {
		for(int i = 0; i < this.length(); i++) {
			if(this.charAt(i) != s.charAt(i)) {
				return false;
	            }
	        }
	        return true;
	    }
	
	public static MyString1 valueOf(int i){
		return new MyString1(Integer.toString(i).toCharArray());
	    }
	    


	 public static void main (String[] args) {
        char[] c = {'S','m','i','T'};
     
        MyString1 s = new MyString1(c);
        
        System.out.print("Verify contents: ");
        s.print();
        System.out.println();
        
        
        System.out.print("MyString1.charAt(int index): ");
        System.out.println(s.charAt(3));
        
        
        System.out.print("MyString1.length(): ");
        System.out.println(s.length());
        
        System.out.print("MyString1.substring(int begin, int end): ");
        s.substring(2,4).print();
        System.out.println();
        
        System.out.print("MyString1.toChars(): ");
        System.out.println(s.toChars());
        
        System.out.print("MyString1.toLowerCase(): ");
        s.toLowerCase().print();
        System.out.print("\n");
        
        char[] c2 = {'S','M','I','T'};
        MyString1 s2 = new MyString1(c2);
        char[] c3 = {'s','m','I','T'};
        MyString1 s3 = new MyString1(c3);
        System.out.println("MyString1.equals(): ");
        
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s.print();
        System.out.print(" ? ");
        System.out.print(s.equals(s));
        System.out.println();
        
        
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s2.print();
        System.out.print(" ? ");
        System.out.println(s.equals(s2));
        
        
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s3.print();
        System.out.print(" ? ");
        System.out.print(s.equals(s3));
        System.out.println();
        
        MyString1.valueOf(145).print();        
    }
}