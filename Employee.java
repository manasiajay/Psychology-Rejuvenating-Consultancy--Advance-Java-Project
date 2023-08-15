//Program on Multiple constructor
import java.util.*;
class Employee{
	int emp_id;
	String emp_name;
	
	// Creating Parameterized constructor
	
	Employee(int i,String n)
	{
		emp_id = i;
		emp_name = n;
	}
	// Printing values
	void print(){

	System.out.println(emp_id+" " +emp_name);
	}

public static void main(String args[]){

	// Creating objects
	Employee e1 = new Employee(101,"Manasi");
	Employee e2 = new Employee(102,"Ajay");

	//Invoking method
	e1.print();
	e2.print();
	}
}
