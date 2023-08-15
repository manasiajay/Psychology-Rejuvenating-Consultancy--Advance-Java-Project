import java.util.*;
class Student{
	String name = "Manasi";
	int mks = 200;
}
public class College extends Student{
	String clg_name = "COEP";
	public static void main(String args[]){
	College c = new College();
	System.out.println("Student's name is:  "+c.name);
	System.out.println("Total marks:  "+c.mks);
 	System.out.println("College allocated is:  "+c.clg_name);

	}
}
	