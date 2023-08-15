import java.util.*;
import java.lang.*;
class IDMismatch extends RuntimeException {
   private String name;
   private int id;
   public IDMismatch(String name, int id){
	super(name, id);
	
	}
}


public class Data_emp{

void dispay_det(){

	System.out.println("Name of the Employee: "+this.name );
      	System.out.println("His/Her ID: "+this.id );
	}
   public static void main(String args[]) {
      Scanner sc= new Scanner (System.in);
	

       try {
		System.out.println("Enter the name of Employee: ");
      		String name = sc.nextLine();
      		System.out.println("Enter the respective ID: ");
      		int id = sc.nextInt();
         	if (id<134||id>1) {
           	String msg = "Your ID must be between 1 and 134 ";
            	IDMismatch ex = new IDMismatch(msg);
            	throw ex;
		
   			
         	}
      	   }
      catch(IDMismatch e) {
        System.out.println("ID Exception handled" +this.id );
      }
      this.name = name;
      this.id = id;
      Data_emp obj = new Data_emp();
      obj.display_det();
      	
		
   
   }
}
 