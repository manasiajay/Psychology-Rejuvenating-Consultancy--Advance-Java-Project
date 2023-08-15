//Program to accept input using command line argument
import java.util.Scanner;
// Java Program to show how to take
// input from user using Scanner Class

class Input_details {

public static void main( String[] args )
{
	
	// Scanner definition
	Scanner Scanner_name= new Scanner(System.in);
	
	
	String str= Scanner_name.nextLine();
	
	// print string
	System.out.println("Entered String : "+ str);
	
	// input is an Integer
	// read by nextInt() function
	int x= Scanner_name.nextInt();
	
	// print integer
	System.out.println("Entered Integer : "+ x);
	
	// input is a floatingValue
	// read by nextFloat() function
	float f = Scanner_name.nextFloat();
	
	// print floating value
	System.out.println("Entered FloatValue : "+ f);
}
}
