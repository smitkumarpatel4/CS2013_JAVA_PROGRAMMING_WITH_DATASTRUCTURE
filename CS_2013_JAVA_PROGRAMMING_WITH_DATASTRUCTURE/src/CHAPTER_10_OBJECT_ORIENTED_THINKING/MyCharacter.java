/***
 * Exercise 10.24 
 */

package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class MyCharacter {
	
    char c;

    public MyCharacter(char c) {
        this.c = c;
    }

    public static boolean isDigit(char c) {
        return c <= '9' && c >= '0';
    }

    public static boolean isLowerCase(char c) {

        return (c <= 'z' && c >= 'a');
    }

    public static boolean isUpperCase(char c) {
        return (c <= 'Z' && c >= 'A');
    }

    public static boolean isLetter(char c) {
        return (c <= 'z' && c >= 'a') ||
                (c <= 'Z' && c >= 'A');
    }

    public static boolean isLetterOrDigit(char c) {
        return isLetter(c) || isDigit(c);
    }

    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            return (char) (c - 'a' + 'A');
        } else {
            return c;
        }
    }

    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            return (char) (c - 'A' + 'a');
        } else {
            return c;
        }
    }

    public boolean isDigit() {
        return isDigit(c);
    }

    public boolean isLetter() {
        return isLetter(c);
    }

    public char getChar() {
        return c;
    }

    public int compareTo(MyCharacter c) {
        return this.c - c.getChar();
    }

    public boolean equals(MyCharacter c) {
        return this.c == c.getChar();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        MyCharacter c = new MyCharacter('S');
        System.out.println("character = " + c.getChar());
        System.out.println("Is a letter: " + c.isLetter());
        System.out.println("Is a digit: " + c.isDigit());
        System.out.println("Convert into Lowercase "+ toLowerCase('F'));
        System.out.println("Convert into Uppercase "+ toUpperCase('r'));
        System.out.println("S == S ?" + c.equals(new MyCharacter('S')));
        System.out.println("S == s ?" + c.equals(new MyCharacter('s')));

	}
	
}
