import java.util.*;
public class Manual_testing1 {
	public static void main(String[] args) 
	{ 
  		int row, column;
  		Scanner sc = new Scanner (System.in);
  		int r,c;
  		System.out.println("Enter the value for row: \n");
  		r = sc.nextInt();
  		System.out.println("Enter the value for column: \n");
  		c = sc.nextInt();
  		System.out.println("Multiplication Table \n");
  		if(r == 5 && c == 5){
  			row = 1; // Initialization.
  			do {
     				column = 1;
     				do{
       					int x = row * column;
       					System.out.printf("%4d", + x);
       					column = column + 1;
      				  }while(column <= 5);
    				  System.out.println("\n");
    				  row = row + 1;
  			   } while(row <= 5);
 			 }
	       else{
                 System.out.println("Try again!: \n");
   		   }
 
	 }
}