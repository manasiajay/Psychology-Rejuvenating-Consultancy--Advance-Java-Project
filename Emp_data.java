//Program on Multiple Inheritance using interfaces
import java.util.*;

interface Emp_mast{
	public void data();

}

interface Emp_info{
	public void info();

}

interface Emp_leaves{
	public void leaves();

}
public class Emp_data implements Emp_mast,Emp_info,Emp_leaves{
	public void data(){
	System.out.println("Employee name : Manasi Powar");
	int id = 1, code = 1023;
	System.out.println("Employee id is : "+ id);
	System.out.println("Employee dept code : "+code);
	}

	public void info(){
	String ad = "221 Baker street";
	System.out.println("Employee address : "+ad);
	int num = 123456;
	System.out.println("Employee number : "+num);
	}

	public void leaves(){
	int l = 57;
	System.out.println("No. of leaves taken by employee : "+l);
	}

	public static void main(String args[]){
	Emp_data obj = new Emp_data();
	obj.data();
	obj.info();
	obj.leaves();
	}
}