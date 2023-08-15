import java.util.*;
import java.lang.*;
//Program incorporating implementation of exception handling and User defined exception
class CustomerException extends Exception {
   
   public CustomerException (String m){
	super(m);
	
	}
}

public class Cust_det{

void display_det(int pid) throws CustomerException{
	if (pid<134) {
           	String msg = "Your Product ID must be greater than 134 ";
            	throw new CustomerException("INVALID PRODUCT ID \n" +msg);
            	}
	
	else if( pid == -1 )	{
		throw new ArithmeticException("Product ID cannot be negative");
	}
	else if( pid == 0 ){
		throw new NullPointerException("ERROR.... ID cannot be 0!");
	}
	else{
		System.out.println("The Product ID is : " +pid);
	}
	
	}
   public static void main(String args[]) {
      Scanner sc= new Scanner (System.in);
	Cust_det obj = new Cust_det();

       try {
		System.out.println("Enter Customer name: ");
      		String name = sc.nextLine();
		System.out.println("Name of the Customer is: "+name );
      		
      		obj.display_det(100);
		
         }  
      catch(CustomerException e) {
        System.out.println("Product ID Exception handled");
	System.out.println(e.getMessage() );
	
	}
	catch(ArithmeticException e)  
         {  
           System.out.println("(ArithmeticException Caught ");  
         } 
         catch(NullPointerException e)  
          {  
            System.out.println("NullPointerException caught");  
          }    
	finally{
		 System.out.println("DEFAULT --Program ends");
		}
     
   }
}
 