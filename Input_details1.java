//Program to accept input using command line argument
//BufferReader class
import java util.*;
class Input_details1{
	public static void main(String args[]){

	BufferReader name = new BufferReader(new InputStreamReader(System.in));

	// Using scanner to capture input
	Scanner input = new Scanner("System.in");

	System.out.println("Enter any String: ");
	String str = name.readLine();
	System.out.println("You have entered a string: "+str);
	}