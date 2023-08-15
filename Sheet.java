import java.util.*;
class Sheet 
  {
	public static void main(String args[])
       {
		// Using scanner to capture input
		Scanner input = new Scanner (System.in);
		int maths, algebra;
		int sum=0,avg,percentage,per,ch;
		System.out.println("Data of a particular student:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter marks for Maths subject:");
	        maths = input.nextInt();
		System.out.println("Enter marks for Algebra subject:");
		algebra = input.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(true)
                {
		System.out.println("1: Display Total Marks of 2 subjects:");
		System.out.println("2: Display Average of 2 Subjects: ");
		System.out.println("3: Display Percentage Acquired:");
		System.out.println("4: Display Grade Acquired:");
		System.out.println("Make your choice:");
		ch = input.nextInt();
		  switch(ch)
		   {
			case 1:
			sum = maths + algebra;
			System.out.println("Sum is: "+sum);
			break;
			
			case 2:
			avg = sum/2;
			System.out.println(" Average is: "+avg);
			break;

			case 3:
			percentage = (sum*100)/200;
			System.out.println("Percentage is: "+percentage + "%");
			break;
			
			case 4:
			System.out.println("To check student's grade on the basis of Percentage");
			per = (sum*100)/200;
			if(per>=80)
        		 {
           		   System.out.println("Distinction A");
         		 }
     			else if( per>=60 && per<80){
           		  System.out.println("Average  B");
         		}
   			else if(per>=40 && per<60){
           	          System.out.println("Pass  C");
         		}
    			else{
         		  System.out.println("Fail  D");
        		}
		default:
			System.out.println("Please enter valid choice ");
		    }
               }
	}
}
			