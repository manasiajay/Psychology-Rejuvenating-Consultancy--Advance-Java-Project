import java.util.*;
import java.lang.*;
class IDMismatchException extends RuntimeException {
   private String name;
   private int id;
   public IDMismatchException(String name, int id){
      try {
         if (id<134||id>1) {
            String msg = "Your ID must be between 1 and 134 ";
            IDMismatchException ex = new IDMismatchException(msg);
            throw ex;
         }
      }
      catch(IDMismatchException e) {
         e.printStackTrace();
      }
      this.name = name;
      this.id = id;
   }  
   public void display_data(){
      System.out.println("Name of the Employee: "+this.name );
      System.out.println("His/Her ID: "+this.id );
   }
}
class Data_emp{
   public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the name of Employee: ");
      String name = sc.nextLine();
      System.out.println("Enter the respective ID: ");
      int id = sc.nextInt();
      Employee_prq obj = new Employee_prq(name, id);
      obj.display_data();
   }
}
 