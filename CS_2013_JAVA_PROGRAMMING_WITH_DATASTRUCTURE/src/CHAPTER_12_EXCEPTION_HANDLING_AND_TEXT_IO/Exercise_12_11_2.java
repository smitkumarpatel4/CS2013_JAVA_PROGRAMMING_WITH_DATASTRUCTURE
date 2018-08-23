package CHAPTER_12_EXCEPTION_HANDLING_AND_TEXT_IO;
import java.io.*;
import java.util.*;
public class Exercise_12_11_2 {

	public static void main (String[] args) throws Exception{
		if(args.length !=2){
			System.out.println("Usage: java Exercise8.21 John FileName");
			System.exit(0);
			}
		//Check FileName if exists
		
		File SourceFile = new File(args[1]);
		
		if(!SourceFile.exists()){
			System.out.println("Source file "+args[1]+" does not exist");
			System.exit(0);
			}
		Scanner input= new Scanner(SourceFile);
		
		PrintWriter output = new PrintWriter(SourceFile);
		
		
		while(input.hasNext()){
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[0], "");
			output.println(s2);
		}
		
		input.close();
		
		output.close();
		
		}
}

