//Menu driven program to implement this,finalise,enum,vector and wrapper classes
import java.util.*;
import java.lang.*;

class employee{
	//void emp_det(){
	int id;
	String name;
	float sal;
	employee(int id,String name,float sal){
	this.id = id;
	this.name = name;
	this.sal = sal;
	}
	void print_data(){
	System.out.println(id+" "+ name +" " + sal);
	}
	
}

			/*protected void finalize()   
    			{   
       				System.out.println("finalize method called");   
    			} */

enum Leaves
{
    SICK, CASUAL, MATERNITY, PATERNITY;
}


class Prog1{
	public static void main(String args[]){
	// Using scanner to capture input
	Scanner input = new Scanner (System.in);
		
		int ch;
		System.out.println("Menu driven program to implement this,finalise,enum,vector and Wrapper classes in JAVA:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(true)
                {
		System.out.println("1: this keyword in JAVA:");
		System.out.println("2: finalise() in JAVA: ");
		System.out.println("3: enum in JAVA:");
		System.out.println("4: Vectors in JAVA:");
		System.out.println("5: Wrapper class in JAVA:");
		System.out.println("6: EXIT:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Make your choice:");
		ch = input.nextInt();
		  
		switch(ch)
		   {
			case 1:
			System.out.println("Details of employees is as follows:");
			employee e1 = new employee(1001,"Manasi",84920f);
			employee e2 = new employee(1002,"Ajay",97080f);
			employee e3 = new employee(1003,"Yash",791277f);
			employee e4 = new employee(1004,"Neha",827260f);
			employee e5 = new employee(1005,"Aditya",8977123f);
			employee e6 = new employee(1006,"Sarthak",6172627f);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			e1.print_data();
			e2.print_data();
			e3.print_data();
			e4.print_data();
			e5.print_data();
			e6.print_data();
			
			break;
			

			case 2: 
			Prog1 obj = new Prog1();
        		System.out.println(obj.hashCode());   
        		obj = null;   
        		// calling garbage collector    
        		System.gc();   
        		System.out.println("end of garbage collection"); 
  	  		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			break;
			
			
			
			case 3:
			System.out.println("Leaves taken by employees is as follows:");
			Leaves l1 = Leaves.SICK;
        		System.out.println(l1);
			Leaves l2 = Leaves.CASUAL;
        		System.out.println(l2);
			Leaves l3 = Leaves.MATERNITY;
        		System.out.println(l3);
			Leaves l4 = Leaves.PATERNITY;
        		System.out.println(l4);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			break;

			case 4:
				System.out.println("Vector Add all method is as follows:");
				Vector<String> vec1 = new Vector<String>(3);
				vec1.add("Manasi");
				vec1.add("Ajay");
				vec1.add("Powar");
				Vector<String> vec2 = new Vector<String>(3);
				vec2.add("Sherlock");
				vec2.add("John");
				vec2.add("Holmes");
				vec1.addAll(0,vec2);
				System.out.println("Combined list is: "+ vec1);
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
				break;

			case 5:
			System.out.println("Wrapper class conversion is as follows:");
			byte b=10;  
			short s=20;  
			int i=30;  
			long l=40;  
			float f=50.0F;  
			double d=60.0D;  
			char z='a';  
			boolean b2=true;  
  
			//Autoboxing: Converting primitives into objects  
			Byte byteobj=b;  
			Short shortobj=s;  
			Integer intobj=i;  
			Long longobj=l;  
			Float floatobj=f;  
			Double doubleobj=d;  
			Character charobj=z;  
			Boolean boolobj=b2;  
  
			//Printing objects  
			System.out.println("---Printing object values---");  
			System.out.println("Byte object: "+byteobj);  
			System.out.println("Short object: "+shortobj);  
			System.out.println("Integer object: "+intobj);  
			System.out.println("Long object: "+longobj);  
			System.out.println("Float object: "+floatobj);  
			System.out.println("Double object: "+doubleobj);  
			System.out.println("Character object: "+charobj);  
			System.out.println("Boolean object: "+boolobj);  
  
			//Unboxing: Converting Objects to Primitives  
			byte bytevalue=byteobj;  
			short shortvalue=shortobj;  
			int intvalue=intobj;  
			long longvalue=longobj;  
			float floatvalue=floatobj;  
			double doublevalue=doubleobj;  
			char charvalue=charobj;  
			boolean boolvalue=boolobj;  
  
			//Printing primitives  
			System.out.println("---Printing primitive values---");  
			System.out.println("byte value: "+bytevalue);  
			System.out.println("short value: "+shortvalue);  
			System.out.println("int value: "+intvalue);  
			System.out.println("long value: "+longvalue);  
			System.out.println("float value: "+floatvalue);  
			System.out.println("double value: "+doublevalue);  
			System.out.println("char value: "+charvalue);  
			System.out.println("boolean value: "+boolvalue);  
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;
			case 6:
			return;

			default:
			System.out.println("Invalid input , Try again!");
			return;
			

		}
	    
	
	}
	
    }
}
	

